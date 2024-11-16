package game.godschaos.repositories;

import game.godschaos.entities.Ability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Abilities", path = "Abilities")
public interface AbilityRepository extends JpaRepository<Ability, Long> {
}
