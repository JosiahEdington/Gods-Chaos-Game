package game.godschaos.models.responses;

import game.godschaos.entities.Ability;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HeroResponse {
    private long heroId;
    private String name;
    private float power;
    private float strength;
    private float wisdom;
    private float endurance;
    private float stamina;
    private List<AbilityResponse> abilities;

    public HeroResponse() { super(); }

}
