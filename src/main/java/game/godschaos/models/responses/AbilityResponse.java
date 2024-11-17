package game.godschaos.models.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AbilityResponse {
    private long abilityId;
    private int abilityNumber;
    private String abilityName;
    private String abilityTrigger;
    private String abilityEffect;

    public AbilityResponse() { super(); }
}
