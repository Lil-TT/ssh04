package com.city.erp.model;

import javax.persistence.*;
import java.util.Set;

/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 13:45
 * @Desc:
 */

@Entity
@Table(name = "productcategory")
public class ProductcategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DEPTNO")
    private int gNo;
    @Basic
    @Column(name = "GName")
    private String gName;
    //一对多的关联关系
    @OneToMany(mappedBy = "department", cascade = CascadeType.REMOVE)
    private Set<UfkProductEntity> products= null;

    public int getgNo() {
        return gNo;
    }

    public void setgNo(int gNo) {
        this.gNo = gNo;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

}
