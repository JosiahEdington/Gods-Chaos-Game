package game.godschaos.services;


import game.godschaos.entities.CollectedHero;
import game.godschaos.entities.Hero;
import game.godschaos.entities.Player;

import java.util.List;
import java.util.Optional;

public interface CollectionService {
    public List<CollectedHero> findAll();
    public Optional<CollectedHero> findByCollectedHero(CollectedHero collectedHero);
    public Optional<CollectedHero> findByHeroAndPlayer(Hero hero, Player player);
    public List<CollectedHero> findAllByPlayer(Player player);
    public List<CollectedHero> findAllByHero(Hero hero);
}
