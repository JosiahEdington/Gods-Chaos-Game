LABEL authors="josiah"

ENTRYPOINT ["top", "-b"]

RUN mkdir /app
RUN mkdir /app/frontend
RUN mkdir /app/backend


FROM node:20-alpine AS build-frontend
WORKDIR /app/frontend
COPY ./src/main/UI/package*.json ./
RUN npm install
COPY ./src/main/UI ./
RUN npm run build

FROM maven:3.9.9-amazoncorretto-17-alpine AS build-backend
WORKDIR /app/backend
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src src
RUN mvn install -DskipTests

RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=/app/backend/target/dependency
COPY --from=build-backend ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build-backend ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build-backend ${DEPENDENCY}/BOOT-INF/classes /app

EXPOSE 8080
ENTRYPOINT ["java", "-cp", "app:app/lib/*", "game.godschaos.GodsChaosApplication"]