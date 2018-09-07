package com.buha.busdpe.base.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "SYS_ROLE")
public class SysRole {

    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String roleName;
    private String descContent;

    private boolean disabled;

    @OneToMany(targetEntity = SysRoleMenu.class,mappedBy = "role")
    private List<SysRoleMenu> roleMenus;

    @OneToMany(targetEntity = SysRoleResource.class,mappedBy = "role")
    private List<SysRoleResource> roleResources;

    @ManyToOne(targetEntity = SysUser.class)
    @JoinColumn(name = "createuser_id")
    private SysUser createUser;
    private Date createDate;
}
