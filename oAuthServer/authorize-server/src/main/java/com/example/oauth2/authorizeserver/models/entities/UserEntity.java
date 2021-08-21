package com.example.oauth2.authorizeserver.models.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Getter
@Table(name="users", schema = "security")
@ToString
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class UserEntity implements Serializable {

    @Id
    @Column(nullable = false)
    private long id;
    @Column(length = 50)
    private String username;
    @Column(length = 512)
    private String password;
    @Column(length = 1000)
    private String roles;

    @Builder
    public UserEntity(long id, String username, String password, String roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

}
