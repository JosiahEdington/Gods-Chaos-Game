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
@Setter
@Getter
@Table(name = "PlayerHeroes")
public class PlayerHeroes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlayerHeroID")
    private Long PlayerHeroID;

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
    private float power;

    @Column(name = "Strength")
    private float strength;

    @Column(name = "Wisdom")
    private float wisdom;

    @Column(name = "Endurance")
    private float endurance;

    @Column(name = "Stamina")
    private float stamina;

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
