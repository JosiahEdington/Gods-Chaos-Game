package game.godschaos.converters;

import game.godschaos.entities.Hero;
import game.godschaos.models.responses.HeroResponse;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class HeroEntityToHeroResponseConverter implements Converter<Hero, HeroResponse> {

    @Override
    public HeroResponse convert(Hero source) {
        HeroResponse heroResponse = new HeroResponse();


        heroResponse.setName(source.getName());
        heroResponse.setPower(source.getBasePower());
        heroResponse.setStrength(source.getBaseStrength());
        heroResponse.setWisdom(source.getBaseWisdom());
        heroResponse.setEndurance(source.getBaseEndurance());
        heroResponse.setStamina(source.getBaseStamina());

        return heroResponse;
    }
}
