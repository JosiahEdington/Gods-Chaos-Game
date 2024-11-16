package game.godschaos.repositories;

import game.godschaos.entities.HeroJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Jobs", path = "Jobs")
public interface HeroJobRepository extends JpaRepository<HeroJob, Long> {
}
