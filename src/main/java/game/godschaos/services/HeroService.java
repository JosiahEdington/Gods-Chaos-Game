package game.godschaos.services;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;

import java.util.List;
import java.util.Optional;

public interface HeroService {
    List<Hero> findAll();
    Optional<Hero> findById(long id);

}


