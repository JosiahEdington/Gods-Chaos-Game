package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "Levels")
public class HeroLevels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LevelID")
    private Long levelID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "HeroID", nullable = false, updatable = false, insertable = false)
    private Hero hero;

    @Column(name = "Level")
    private int level;

    @Column(name = "IsCap")
    private boolean isCap;

    @Column(name = "CapRank")
    private int cap;

    @Column(name = "CapUnlock")
    private int rank;

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

    @Column(name = "BreadNeeded")
    private int breadNeeded;

    @Column(name = "BreadNeededFive")
    private int breadNeededFive;

    @Column(name = "BreadToGet")
    private int breadToGet;

    @Column(name = "HeroesNeeded")
    private int heroesNeeded;

    @Column(name = "UpLevels")
    private int upLevels;

    @Column(name = "Unlocks")
    private String unlocks;

    @Column(name = "UnlocksValue")
    private int unlocksValue;

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

    @Column(name = "HeroID")
    private Long heroID;

}
