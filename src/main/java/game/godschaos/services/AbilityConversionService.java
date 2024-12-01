package game.godschaos.services;

import game.godschaos.entities.Ability;
import game.godschaos.models.responses.AbilityResponse;

public interface AbilityResponseService {
    public AbilityResponse getAbilityResponse(Ability ability);
}
