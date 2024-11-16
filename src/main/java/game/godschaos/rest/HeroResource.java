package game.godschaos.rest;

import game.godschaos.entities.Hero;
import game.godschaos.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
    private HeroRepository heroRepository;

    @RequestMapping(path = "/hero", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hero> getHeroes() {
        List<Hero> heroes = new ArrayList<>();


        return heroes;
    }

    public void setName(String name) {

    }
}
