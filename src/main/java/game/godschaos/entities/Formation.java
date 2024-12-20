package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Formations")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FormationID")
    private Long formationID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PlayerID", nullable = false, insertable = false, updatable = false)
    private Player player;

    /**
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "FormationHeroID")
    private Set<PlayerHeroes>  playerHeroes = new HashSet<>();
    **/

    @Column(name = "TotalPower")
    private Double totalPower;

    @Column(name = "TotalTroops")
    private Integer totalTroops;

    @Column(name = "CreateDateTime")
    @CreationTimestamp
    private LocalDateTime createDateTime;

    @Column(name = "CreateBy")
    private String createBy;

    @Column(name = "UpdateDateTime")
    @UpdateTimestamp
    private LocalDateTime updateDateTime;

    @Column(name = "UpdateBy")
    private String updateBy;
}
