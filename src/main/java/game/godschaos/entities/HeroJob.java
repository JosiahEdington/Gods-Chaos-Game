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
@Table(name = "Jobs")
public class HeroJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JobID")
    private Long JobId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Type")
    private String type;

    @Column(name = "Building")
    private String building;

    @Column(name = "PowerMultiplier")
    private double powerMultiplier;

    @Column(name = "StrengthMultiplier")
    private double strengthMultiplier;

    @Column(name = "WisdomMultiplier")
    private double wisdomMultiplier;

    @Column(name = "EnduranceMultiplier")
    private double enduranceMultiplier;

    @Column(name = "StaminaMultiplier")
    private double staminaMultiplier;

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
