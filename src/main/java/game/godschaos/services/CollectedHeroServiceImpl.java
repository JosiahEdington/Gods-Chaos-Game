package game.godschaos.services;

import game.godschaos.entities.CollectedHero;
import game.godschaos.entities.Hero;
import game.godschaos.entities.Player;
import game.godschaos.repositories.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollectionServiceImpl implements CollectionService {
    private CollectionRepository collectionRepository;

    @Autowired
    public CollectionServiceImpl(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @Override
    public List<CollectedHero> findAll() {
        return collectionRepository.findAll();
    }

    @Override
    public Optional<CollectedHero> findByCollectedHero(CollectedHero collectedHero) {
        return collectionRepository.findById(collectedHero.getCollectedHeroID());
    }

    @Override
    public Optional<CollectedHero> findByHeroAndPlayer(Hero hero, Player player) {
        return collectionRepository.findByHeroAndPlayer(hero, player);
    }

    @Override
    public List<CollectedHero> findAllByPlayer(Player player) {
        return collectionRepository.findByPlayer(player);
    }

    @Override
    public List<CollectedHero> findAllByHero(Hero hero) {
        return collectionRepository.findByHero(hero);
    }

}
