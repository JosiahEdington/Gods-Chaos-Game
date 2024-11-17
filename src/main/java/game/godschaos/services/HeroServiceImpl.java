package game.godschaos.services;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;
import game.godschaos.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService {
    private HeroRepository heroRepository;

    @Autowired
    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public List<Hero> findAll() { return (List<Hero>) heroRepository.findAll(); }


    @Override
    public Optional<Hero> findById(long id) { return heroRepository.findById(id); }

    @Override
    public List<Hero> findByAbility(Ability ability) { return heroRepository.findByAbility(ability); }
}
