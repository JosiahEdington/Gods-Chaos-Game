package game.godschaos.models.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AbilityResponse {
    private Long abilityId;
    private Integer abilityNumber;
    private String abilityName;
    private String abilityTrigger;
    private String abilityEffect;
    private String abilityDamage;

    public AbilityResponse() { super(); }
}
