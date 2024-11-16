package game.godschaos.repositories;

import game.godschaos.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Players", path = "Players")
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
