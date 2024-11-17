package game.godschaos.converters;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;
import game.godschaos.models.responses.AbilityResponse;
import game.godschaos.models.responses.HeroResponse;
import game.godschaos.services.AbilityService;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HeroToHeroResponseConverter implements Converter<Hero, HeroResponse> {
    private final ApplicationContext context;

    public HeroToHeroResponseConverter(ApplicationContext context) { this.context = context; }

    @Override
    public HeroResponse convert(Hero source) {
        HeroResponse heroResponse = new HeroResponse();

        ConversionService conversionService = this.context.getBean(ConversionService.class);
        AbilityService abilityService = this.context.getBean(AbilityService.class);
        List<Ability> abilities = abilityService.findByHero(source);
        List<AbilityResponse> heroAbilities = new ArrayList<>();
        for (Ability ability : abilities) {
            heroAbilities.add(conversionService.convert(ability, AbilityResponse.class));

        }

        heroResponse.setName(source.getName());
        heroResponse.setPower(source.getBasePower());
        heroResponse.setStrength(source.getBaseStrength());
        heroResponse.setWisdom(source.getBaseWisdom());
        heroResponse.setEndurance(source.getBaseEndurance());
        heroResponse.setStamina(source.getBaseStamina());
        heroResponse.setAbilities(heroAbilities);


        return heroResponse;
    }
}
