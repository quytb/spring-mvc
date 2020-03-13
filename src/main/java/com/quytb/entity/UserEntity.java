package com.quytb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "status")
    private Integer status;
    @Column(name = "roleid")
    private Long roleId;

    @ManyToMany(fetch = FetchType.EAGER)
            @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"),
            inverseJoinColumns = @JoinColumn(name = "roleid"))
    List<RoleEntity> roles = new ArrayList<>();
}
