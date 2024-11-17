package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Abilities")
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AbilityID")
    private Long abilityId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "HeroAbilities",
            joinColumns = @JoinColumn(name = "AbilityID", nullable = false, insertable = false, updatable = false),
            inverseJoinColumns = @JoinColumn(name = "HeroID", nullable = false, insertable = false, updatable = false))
    private Set<Hero> heroes = new HashSet<>();

    @Column(name = "Name")
    private String name;

    @Column(name = "Sort")
    private int sort;

    @Column(name = "Type")
    private String type;

    @Column(name = "TriggerDamage")
    private String triggerDamage;

    @Column(name = "Trigger")
    private String trigger;

    @Column(name = "ResultDamage")
    private String resultDamage;

    @Column(name = "Result")
    private String result;

    @Column(name = "Unlocks")
    private String unlocks;

    @Column(name = "UnlocksValue")
    private String unlocksValue;

    @Column(name = "LevelUpRanks")
    private String levelUpRanks;

    @Column(name = "Description")
    private String description;

    @Column(name = "MinRank")
    private Integer minRank;

    @Column(name = "IsDeleted")
    private boolean isDeleted;

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
