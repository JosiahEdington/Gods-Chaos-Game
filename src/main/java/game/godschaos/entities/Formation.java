package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Formations")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FormationID")
    private Long formationID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PlayerID", nullable = false, insertable = false, updatable = false)
    private Player player;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FormationHeroID")
    private Set<PlayerHeroes>  playerHeroes = new HashSet<>();

    @Column(name = "FormationPower")
    private Integer formationPower;

    @Column(name = "Troops")
    private Integer troops;

    @Column(name = "CreateDateTime")
    @CreationTimestamp
    private Timestamp createDateTime;

    @Column(name = "CreateBy")
    private String createBy;

    @Column(name = "UpdateDateTime")
    @UpdateTimestamp
    private Timestamp updateDateTime;

    @Column(name = "UpdateBy")
    private String updateBy;
}
