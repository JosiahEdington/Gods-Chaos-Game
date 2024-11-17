package game.godschaos.services;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;
import game.godschaos.repositories.AbilityRepository;

import java.util.List;

public class AbilityServiceImpl implements AbilityService {
    private AbilityRepository abilityRepository;

    @Override
    public List<Ability> findAll() {
        return abilityRepository.findAll();
    }

    @Override
    public Ability findById(long abilityId) {
        return abilityRepository.getReferenceById(abilityId);
    }

    @Override
    public List<Ability> findByHero(Hero hero) {
        return abilityRepository.findByHeroes(hero);
    }

}
