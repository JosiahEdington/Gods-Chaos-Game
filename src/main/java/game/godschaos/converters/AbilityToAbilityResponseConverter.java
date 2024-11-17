package game.godschaos.converters;

import game.godschaos.entities.Ability;
import game.godschaos.models.responses.AbilityResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AbilityToAbilityResponseConverter implements Converter<Ability, AbilityResponse> {
    public AbilityToAbilityResponseConverter() {}

    @Override
    public AbilityResponse convert(Ability source) {
        AbilityResponse abilityResponse = new AbilityResponse();

        abilityResponse.setAbilityId(source.getAbilityId());
        abilityResponse.setAbilityNumber(source.getSort());
        abilityResponse.setAbilityName(source.getName());
        abilityResponse.setAbilityTrigger(source.getTrigger());
        abilityResponse.setAbilityEffect(source.getResult());
        return abilityResponse;
    }
}
