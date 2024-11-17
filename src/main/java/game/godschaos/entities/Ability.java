package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Abilities")
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "MinRank")
    private int minRank;

    @Column(name = "LevelUpRanks")
    private String levelUpRanks;

    @Column(name = "IsDeleted")
    private boolean isDeleted;

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
