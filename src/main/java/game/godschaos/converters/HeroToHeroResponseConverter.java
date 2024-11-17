package game.godschaos.converters;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;
import game.godschaos.models.responses.AbilityResponse;
import game.godschaos.models.responses.HeroResponse;
import game.godschaos.repositories.AbilityRepository;
import game.godschaos.repositories.HeroRepository;
import game.godschaos.services.AbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Component
public class HeroToHeroResponseConverter implements Converter<Hero, HeroResponse> {
    ApplicationContext applicationContext;

    public HeroToHeroResponseConverter(ApplicationContext context) { ;
        this.applicationContext = context;
    }

    @Override
    public HeroResponse convert(Hero source) {
        HeroResponse heroResponse = new HeroResponse();
        AbilityService abilityService = applicationContext.getBean(AbilityService.class);

        Set<Ability> abilities = source.getAbilities();
        Set<AbilityResponse> abilityResponses = new HashSet<>();
        for (Ability ability : abilities) {
            AbilityResponse abilityResponse = new AbilityResponse();
            abilityResponse.setAbilityId(ability.getAbilityId());
            abilityResponse.setAbilityName(ability.getName());
            abilityResponse.setAbilityNumber(ability.getSort());
            abilityResponse.setAbilityTrigger(ability.getTrigger());
            abilityResponse.setAbilityEffect(ability.getResult());
            abilityResponses.add(abilityResponse);
        }

        heroResponse.setHeroId(source.getHeroId());
        heroResponse.setName(source.getName());
        heroResponse.setPower(source.getBasePower());
        heroResponse.setStrength(source.getBaseStrength());
        heroResponse.setWisdom(source.getBaseWisdom());
        heroResponse.setEndurance(source.getBaseEndurance());
        heroResponse.setStamina(source.getBaseStamina());
        heroResponse.setAbilities(abilityResponses);


        return heroResponse;
    }
}
