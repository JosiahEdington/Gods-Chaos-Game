-- DB Creation Script
USE `GodsChaosGame`;

CREATE TABLE IF NOT EXISTS `Players` (
  `PlayerID` BigInt AUTO_INCREMENT,
  `Name` varchar(255),
  `UserName` varchar(255),
  `Level` int,
  `ClanID` BigInt,
  `ClanRole` varchar(255),
  `CreateDateUtc` timestamp DEFAULT CURRENT_TIMESTAMP,
  `CreateBy` varchar(255),
  `UpdateDateUtc` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UpdateBy` varchar(255),
  PRIMARY KEY (`PlayerID`)
);

CREATE TABLE IF NOT EXISTS `Abilities` (
  `AbilityID` BigInt AUTO_INCREMENT,
  `Sort` int,
  `Name` varchar(255),
  `Type` varchar(255),
  `TriggerDamage` varchar(255),
  `Trigger` varchar(255),
  `ResultDamage` varchar(255),
  `Result` varchar(255),
  `Unlocks` varchar(255),
  `UnlocksValue` varchar(255),
  `CreateDate` timestamp DEFAULT CURRENT_TIMESTAMP,
  `CreateBy` varchar(255),
  `UpdateDate` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UpdateBy` varchar(255),
  PRIMARY KEY (`AbilityID`)
);


CREATE TABLE IF NOT EXISTS `Heroes` (
  `HeroID` BigInt AUTO_INCREMENT,
  `Name` varchar(255),
  `Culture` varchar(255),
  `IsSTier` bit,
  `FighterType` varchar(255),
  `BaseStar` int,
  `MaxStar` int,
  `BasePower` double,
  `BaseStrength` double,
  `BaseWisdom` double,
  `BaseEndurance` double,
  `BaseStamina` double,
  `AbilityID1` BigInt,
  `AbilityID2` BigInt,
  `AbilityID3` BigInt,
  `AbilityID4` BigInt,
  `Icon` BigInt,
  `Description` varchar(1000),
  `CreatedDate` timestamp DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(255),
  `UpdatedDate` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UpdatedBy` varchar(255),
  PRIMARY KEY (`HeroID`),
  FOREIGN KEY (AbilityID1) REFERENCES Abilities(AbilityID),
  FOREIGN KEY (AbilityID2) REFERENCES Abilities(AbilityID),
  FOREIGN KEY (AbilityID3) REFERENCES Abilities(AbilityID),
  FOREIGN KEY (AbilityID4) REFERENCES Abilities(AbilityID)
);

CREATE TABLE IF NOT EXISTS `Jobs` (
  `JobID` BigInt AUTO_INCREMENT,
  `Name` varchar(255),
  `Type` varchar(500),
  `Building` varchar(255),
  `PowerMultiplier` double,
  `StrengthMultiplier` double,
  `WisdomMultiplier` double,
  `EnduranceMultiplier` double,
  `StaminaMultiplier` double,
  `CreateDateUtc` timestamp DEFAULT CURRENT_TIMESTAMP,
  `CreateBy` varchar(255),
  `UpdateDateUtc` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UpdateBy` varchar(255),
  PRIMARY KEY (`JobID`)
);

CREATE TABLE  IF NOT EXISTS `Levels` (
  `LevelID` BigInt AUTO_INCREMENT,
  `HeroID` BigInt,
  `Level` int unsigned,
  `IsCap` bit DEFAULT 0,
  `Cap` int unsigned,
  `Rank` int unsigned,
  `Power` double(9,2),
  `Strength` double,
  `Wisdom` double,
  `Endurance` double,
  `Stamina` double,
  `BreadNeeded` int unsigned,
  `BreadNeededFive` int unsigned,
  `BreadToGet` int unsigned,
  `HeroesNeeded` int unsigned,
  `UpLevels` int unsigned,
  `Unlocks` varchar(255),
  `UnlocksValue` varchar(255),
  `CreateDate` timestamp DEFAULT CURRENT_TIMESTAMP,
  `CreateBy` varchar(255),
  `UpdateDate` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UpdateBy` varchar(255),
  PRIMARY KEY (`LevelID`),
  FOREIGN KEY (HeroID) REFERENCES Heroes(HeroID)
);

CREATE TABLE IF NOT EXISTS `Formations` (
  `FormationID` BigInt AUTO_INCREMENT,
  `PlayerID` BigInt,
  `Order` int unsigned,
  `FormationPower` int unsigned,
  `Troops` int unsigned,
  `CollectionID_Hero1` BigInt,
  `CollectionID_Hero2` BigInt,
  `CollectionID_Hero3` BigInt,
  `CreateDateUtc` timestamp DEFAULT CURRENT_TIMESTAMP,
  `CreateBy` varchar(255),
  `UpdateDateUtc` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UpdateBy` varchar(255),
  PRIMARY KEY (`FormationID`),
  FOREIGN KEY (PlayerID) REFERENCES Players(PlayerID)
);

CREATE TABLE IF NOT EXISTS `Collections`  (
  `CollectionID` BigInt AUTO_INCREMENT,
  `PlayerID` BigInt,
  `HeroID` BigInt,
  `JobID` BigInt,
  `FormationID` BigInt,
  `Level` int unsigned,
  `AtCap` bit,
  `Rank` int unsigned,
  `Star` int unsigned,
  `Power` double(7,2),
  `Strength` double,
  `Wisdom` double,
  `Endurance` double,
  `Stamina` double,
  `CreateDate` timestamp DEFAULT CURRENT_TIMESTAMP,
  `CreateBy` varchar(255),
  `UpdateDate` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UpdateBy` varchar(255),
  PRIMARY KEY (`CollectionID`),
  FOREIGN KEY (PlayerID) REFERENCES Players(PlayerID),
  FOREIGN KEY (HeroID) REFERENCES Heroes(HeroID),
  FOREIGN KEY (JobID) REFERENCES Jobs(JobID),
  FOREIGN KEY (FormationID) REFERENCES Formations(FormationID)
);


