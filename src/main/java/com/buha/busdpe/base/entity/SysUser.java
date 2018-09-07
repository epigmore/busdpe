package com.buha.busdpe.base.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "SYS_USER")
public class SysUser {

    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String username;
    private String password;

    @ManyToOne(targetEntity = SysDept.class)
    @JoinColumn(name = "dept_code")
    private SysDept dept;

    @ManyToOne(targetEntity = SysRole.class)
    @JoinColumn(name = "role_id")
    private SysRole role;

    private String email;
    private String phoneNumber;
    private String idCard;
    private String realName;
    private String birthDate;
    private String sex;
    private String nation;

    private boolean expired;

    @ManyToOne(targetEntity = SysUser.class)
    @JoinColumn(name = "createuser_id")
    private SysUser createUser;
    @ManyToOne(targetEntity = SysDept.class)
    @JoinColumn(name = "createdept_code")
    private SysDept createDept;
    private Date createDate;


}
