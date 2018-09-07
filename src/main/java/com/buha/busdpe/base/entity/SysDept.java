package com.buha.busdpe.base.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "SYS_DEPT")
public class SysDept {

    @Id
    @Column(length = 30)
    private String deptCode;
    private String deptName;
    private String indexCode;
    private String superCode;
    private String deprecatedSign;
    private Date deprecatedTime;
}
