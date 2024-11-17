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
@Table(name = "Players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlayerID")
    private Long playerID;

    @Column(name = "Name")
    private String name;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "Level")
    private int level;

    @Column(name = "ClanID")
    private String clanID;

    @Column(name = "ClanRole")
    private String clanRole;

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
