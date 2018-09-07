package com.buha.busdpe.base.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "SYS_MENU")
public class SysMenu {

    @Id
    @Column(length = 30)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;
    private String url;
    private String icon;

    @ManyToOne(targetEntity = SysMenu.class)
    @JoinColumn(name = "parent_menu_id")
    private SysMenu parent;

    @OneToMany(targetEntity = SysMenu.class, mappedBy = "parent")
    private List<SysMenu> children;
    private int orderIndex;

    @ManyToOne(targetEntity = SysUser.class)
    @JoinColumn(name = "createuser_id")
    private SysUser createUser;
    private Date createDate;
}
