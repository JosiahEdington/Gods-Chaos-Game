package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "Collection")
public class Collections {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CollectionID")
    private Long collectionID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PlayerID", nullable = false, insertable = false, updatable = false)
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HeroID", nullable = false, insertable = false, updatable = false)
    private Hero hero;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JobID", nullable = true, insertable = false, updatable = true)
    private HeroJob heroJob;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FormationID", nullable = true, insertable = true, updatable = true)
    private Formation formations;

    @Column(name = "Level")
    private Integer level;

    @Column(name = "AtCap")
    private Boolean atCap;

    @Column(name = "Rank")
    private Integer rank;

    @Column(name = "Star")
    private Integer star;

    @Column(name = "Power")
    private Double power;

    @Column(name = "Strength")
    private Double strength;

    @Column(name = "Wisdom")
    private Double wisdom;

    @Column(name = "Endurance")
    private Double endurance;

    @Column(name = "Stamina")
    private Double stamina;

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
