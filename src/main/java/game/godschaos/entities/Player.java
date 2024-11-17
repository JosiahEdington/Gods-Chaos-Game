package game.godschaos.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.units.qual.C;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import java.security.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "Players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PlayerID")
    private Long playerID;

    @Column(name = "Name")
    private String name;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Level")
    private Integer level;

    @Column(name = "ClanID")
    private String clanID;

    @Column(name = "ClanRole")
    private String clanRole;

    @Column(name = "Role")
    private String role;

    @Column(name = "IsDeleted")
    private Boolean isDeleted;

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
