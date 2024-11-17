package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import java.security.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "Levels")
public class HeroLevels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HeroLevelID")
    private Long heroLevelID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "HeroID", nullable = false, updatable = false, insertable = false)
    private Hero hero;

    @Column(name = "Level")
    private Integer level;

    @Column(name = "LevelCap")
    private Integer levelCap;

    @Column(name = "IsCap")
    private Boolean isCap;

    @Column(name = "Star")
    private Integer star;

    @Column(name = "CapRank")
    private Integer capRank;

    @Column(name = "CapUnlock")
    private Integer capUnlock;

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

    @Column(name = "BreadNeeded")
    private Integer breadNeeded;

    @Column(name = "BreadNeededFive")
    private Integer breadNeededFive;

    @Column(name = "BreadToGet")
    private Integer breadToGet;

    @Column(name = "HeroesNeeded")
    private Integer heroesNeeded;

    @Column(name = "UpLevels")
    private Integer upLevels;

    @Column(name = "Unlocks")
    private String unlocks;

    @Column(name = "UnlocksValue")
    private String unlocksValue;

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

    @Column(name = "HeroID")
    private Long heroID;

}
