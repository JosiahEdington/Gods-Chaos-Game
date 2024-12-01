package game.godschaos.services;

import game.godschaos.entities.Hero;
import game.godschaos.models.responses.AbilityResponse;
import game.godschaos.models.responses.HeroResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroResponseServiceImpl implements HeroConversionService {
    @Override
    public HeroResponse getHeroResponse(Hero hero, List<AbilityResponse> abilityResponse) {
        HeroResponse heroResponse = new HeroResponse();
        heroResponse.setHeroId(hero.getHeroId());
        heroResponse.setName(hero.getName());
        heroResponse.setFighterType(hero.getFighterType());
        heroResponse.setCulture(hero.getCulture());
        heroResponse.setPower(hero.getBasePower());
        heroResponse.setStrength(hero.getBaseStrength());
        heroResponse.setWisdom(hero.getBaseWisdom());
        heroResponse.setEndurance(hero.getBaseEndurance());
        heroResponse.setStamina(hero.getBaseStamina());
        heroResponse.setAbilities(abilityResponses);

        return heroResponse;
    }
}
