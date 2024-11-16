package game.godschaos.repositories;

import game.godschaos.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Formations", path = "Formations")
public interface FormationRepository extends JpaRepository<Formation, Long> {
}
