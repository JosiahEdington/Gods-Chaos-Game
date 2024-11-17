package game.godschaos.rest;

import game.godschaos.entities.Hero;
import game.godschaos.models.responses.HeroResponse;
import game.godschaos.repositories.AbilityRepository;
import game.godschaos.repositories.HeroRepository;
import game.godschaos.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(ResourceConstants.BASE_URL)
@CrossOrigin
public class HeroResource {
    @Autowired
    ApplicationContext context;

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    AbilityRepository abilityRepository;

    @Autowired
    ConversionService conversionService;

    @Autowired
    PlayerRepository playerRepository;


    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HeroResponse>> getHeroes() {
        List<Hero> heroes = heroRepository.findAll();
        List<HeroResponse> heroResponses = new ArrayList<>();

        for (Hero hero : heroes) {
            System.out.println(hero.getName());
            heroResponses.add(conversionService.convert(hero, HeroResponse.class));
        }

        return new ResponseEntity<>(heroResponses, HttpStatus.OK);
    }

}
