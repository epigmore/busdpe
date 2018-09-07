package com.buha.busdpe.base.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "SYS_ROLE_MENU")
public class SysRoleMenu {

    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @ManyToOne(targetEntity = SysRole.class)
    @JoinColumn(name = "role_id")
    private SysRole role;

    @ManyToOne(targetEntity = SysMenu.class)
    @JoinColumn(name = "menu_id")
    private SysMenu menu;

    @ManyToOne(targetEntity = SysUser.class)
    @JoinColumn(name = "createuser_id")
    private SysUser createUser;
    private Date createDate;
}
