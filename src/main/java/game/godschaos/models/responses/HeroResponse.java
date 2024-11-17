package game.godschaos.models.responses;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class HeroResponse {
    private Long heroId;
    private String name;
    private Double power;
    private Double strength;
    private Double wisdom;
    private Double endurance;
    private Double stamina;
    private Set<AbilityResponse> abilities;

    public HeroResponse() { super(); }

}
