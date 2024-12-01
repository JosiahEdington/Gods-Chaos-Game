package game.godschaos.services;

import game.godschaos.entities.Ability;
import game.godschaos.models.responses.AbilityResponse;
import org.springframework.stereotype.Service;

@Service
public class AbilityResponseServiceImpl implements AbilityResponseService {

    @Override
    public AbilityResponse getAbilityResponse(Ability ability) {
        AbilityResponse abilityResponse = new AbilityResponse();

        abilityResponse.setAbilityId(ability.getAbilityId());
        abilityResponse.setAbilityName(ability.getName());
        abilityResponse.setAbilityNumber(ability.getSort());
        abilityResponse.setAbilityTrigger(ability.getTrigger());
        abilityResponse.setAbilityEffect(ability.getResult());

        return abilityResponse;
    }
}
