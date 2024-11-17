package game.godschaos.services;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;
import game.godschaos.repositories.AbilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilityServiceImpl implements AbilityService {
    private AbilityRepository abilityRepository;

    @Autowired
    public AbilityServiceImpl(AbilityRepository abilityRepository) {
        this.abilityRepository = abilityRepository;
    }

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
