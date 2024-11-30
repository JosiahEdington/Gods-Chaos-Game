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
    abilities!: Ability[];
}
