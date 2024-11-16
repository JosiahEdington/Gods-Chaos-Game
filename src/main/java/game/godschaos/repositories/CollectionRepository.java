package game.godschaos.repositories;

import game.godschaos.entities.PlayerHeroes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Collections", path = "Collections")
public interface CollectionRepository extends JpaRepository<PlayerHeroes, Long> {
}
