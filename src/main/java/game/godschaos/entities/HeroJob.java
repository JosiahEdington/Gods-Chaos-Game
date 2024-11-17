package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "Jobs")
public class HeroJob {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "JobID")
    private Long JobId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Type")
    private String type;

    @Column(name = "Building")
    private String building;

    @Column(name = "PowerMultiplier")
    private Double powerMultiplier;

    @Column(name = "StrengthMultiplier")
    private Double strengthMultiplier;

    @Column(name = "WisdomMultiplier")
    private Double wisdomMultiplier;

    @Column(name = "EnduranceMultiplier")
    private Double enduranceMultiplier;

    @Column(name = "StaminaMultiplier")
    private Double staminaMultiplier;

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
