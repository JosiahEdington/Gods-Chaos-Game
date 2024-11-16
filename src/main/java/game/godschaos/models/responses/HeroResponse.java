package game.godschaos.models.responses;

import game.godschaos.entities.Ability;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeroResponse {
    private String name;
    private float power;
    private float strength;
    private float wisdom;
    private float endurance;
    private float stamina;
    private Ability ability_first;
    private Ability ability_second;
    private Ability ability_third;

    public HeroResponse() { super(); }

    /**
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public float getPower() { return power; }
    public void setPower(float power) { this.power = power; }

    public float getStrength() { return strength; }
    public void setStrength(float strength) { this.strength = strength; }

    public float getWisdom() { return wisdom; }
    public void setWisdom(float wisdom) { this.wisdom = wisdom; }

    public float getEndurance() { return endurance; }
    public void setEndurance(float endurance) { this.endurance = endurance; }

    public float getStamina() { return stamina; }
    public void setStamina(float stamina) { this.stamina = stamina; }

    public Ability getAbility_first() { return ability_first; }
    public void setAbility_first(Ability ability_first) { this.ability_first = ability_first; }

    public Ability getAbility_second() { return ability_second; }
    public void setAbility_second(Ability ability_second) { this.ability_second = ability_second; }

    public Ability getAbility_third() { return ability_third; }
    public void setAbility_third(Ability ability_third) { this.ability_third = ability_third; }
     **/
}
