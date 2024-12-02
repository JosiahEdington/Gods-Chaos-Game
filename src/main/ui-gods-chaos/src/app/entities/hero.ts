import { Ability } from "./ability";

export class Hero {
    heroId!: number;
    name!: string;
    power!: number;
    fighterType!: string;
    culture!: string;
    strength!: number;
    wisdom!: number;
    endurance!: number;
    stamina!: number;
    ability1!: Ability;
    ability2!: Ability;
    ability3!: Ability;
}
