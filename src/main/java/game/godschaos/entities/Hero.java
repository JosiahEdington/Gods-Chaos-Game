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
@Table(name = "Heroes")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HeroID")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Culture")
    private String culture;

    @Column(name = "IsSTier")
    private boolean isStier;

    @Column(name = "FighterType")
    private String fighterType;

    @Column(name = "BaseLevel")
    private int baseLevel;

    @Column(name = "MaxLevel")
    private int maxLevel;

    @Column(name = "BaseStar")
    private int baseStar;

    @Column(name = "MaxStar")
    private int maxStar;

    @Column(name = "BasePower")
    private float basePower;

    @Column(name = "BaseStrength")
    private float baseStrength;

    @Column(name = "BaseWisdom")
    private float baseWisdom;

    @Column(name = "BaseEndurance")
    private float baseEndurance;

    @Column(name = "BaseStamina")
    private float baseStamina;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "HeroAbilities",
        joinColumns = @JoinColumn(name = "HeroID", nullable = false, insertable = false, updatable = false),
        inverseJoinColumns = @JoinColumn(name = "AbilityID", nullable = false, insertable = false, updatable = false))
    private Set<Ability> abilities = new HashSet<>();

    @Column(name = "Icon")
    private String icon;

    @Column(name = "IsDeleted")
    private boolean isDeleted;

    @Column(name = "Description")
    private String description;

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
