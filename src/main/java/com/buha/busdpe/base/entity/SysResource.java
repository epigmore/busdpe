package com.buha.busdpe.base.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "SYS_RESOURCE")
public class SysResource {

    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;
    private String url;
    private String orderIndex;

    @ManyToOne(targetEntity = SysResource.class)
    @JoinColumn(name = "resource_group_id")
    private SysResource resourceGroup;
    @OneToMany(targetEntity = SysResource.class, mappedBy = "resourceGroup", fetch = FetchType.LAZY)
    private List<SysResource> children;

    private boolean disabled;

    @ManyToOne(targetEntity = SysUser.class)
    @JoinColumn(name = "createuser_id")
    private SysUser createUser;
    private Date createDate;

}