package game.godschaos.repositories;

import game.godschaos.entities.HeroLevels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Levels", path = "Levels")
public interface LevelRepository extends JpaRepository<HeroLevels, Integer> {
}
