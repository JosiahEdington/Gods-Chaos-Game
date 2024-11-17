package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "Heroes")
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HeroID")
    private Long heroId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Culture")
    private String culture;

    @Column(name = "IsSTier")
    private Boolean isStier;

    @Column(name = "FighterType")
    private String fighterType;

    @Column(name = "BaseLevel")
    private Integer baseLevel;

    @Column(name = "MaxLevel")
    private Integer maxLevel;

    @Column(name = "BaseStar")
    private Integer baseStar;

    @Column(name = "MaxStar")
    private Integer maxStar;

    @Column(name = "BasePower")
    private Double basePower;

    @Column(name = "BaseStrength")
    private Double baseStrength;

    @Column(name = "BaseWisdom")
    private Double baseWisdom;

    @Column(name = "BaseEndurance")
    private Double baseEndurance;

    @Column(name = "BaseStamina")
    private Double baseStamina;

    @Column(name = "MeasuredStar")
    private Integer measuredStar;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "HeroAbilities",
        joinColumns = @JoinColumn(name = "HeroID", nullable = false, insertable = false, updatable = false),
        inverseJoinColumns = @JoinColumn(name = "AbilityID", nullable = false, insertable = false, updatable = false))
    private Set<Ability> abilities = new HashSet<>();

    @Column(name = "Icon")
    private String icon;

    @Column(name = "IsDeleted")
    private Boolean isDeleted;

    @Column(name = "Description")
    private String description;

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
