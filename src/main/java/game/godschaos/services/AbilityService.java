package game.godschaos.services;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;

import java.util.List;

public interface AbilityService {
    public List<Ability> findAll();
    public Ability findById(long id);
    public List<Ability> findByHero(Hero hero);
}
