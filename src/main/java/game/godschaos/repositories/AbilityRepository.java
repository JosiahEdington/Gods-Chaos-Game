package game.godschaos.repositories;

import game.godschaos.entities.Ability;
import game.godschaos.entities.Hero;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "Abilities", path = "Abilities")
public interface AbilityRepository extends JpaRepository<Ability, Long> {
    List<Ability> findByHero(Hero hero);
}
