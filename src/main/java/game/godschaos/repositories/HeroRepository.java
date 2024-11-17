package game.godschaos.repositories;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Heroes", path = "Heroes")
public interface HeroRepository extends JpaRepository<Hero, Long> {
    List<Hero> findByAbility(Ability ability);
}
