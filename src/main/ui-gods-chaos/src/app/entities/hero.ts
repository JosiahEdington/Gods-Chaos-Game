import { Ability } from "./ability";

export class Hero {
    heroId!: number;
    name!: string;
    power!: number;
    strength!: number;
    wisdom!: number;
    endurance!: number;
    stamina!: number;
    abilities!: [key: Ability];
}
