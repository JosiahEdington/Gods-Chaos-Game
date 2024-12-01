package game.godschaos.services;

import game.godschaos.entities.Hero;
import game.godschaos.models.responses.HeroResponse;

public interface HeroResponseService {
    public HeroResponse getHeroResponse(Hero hero);
}
