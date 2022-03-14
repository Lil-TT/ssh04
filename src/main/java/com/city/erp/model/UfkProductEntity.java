package com.city.erp.model;

import javax.persistence.*;
import java.io.Serializable;

/*
 * @Author: Lil-TT
 * @Date: 2022-03-10 13:45
 * @Desc:
 */

@Entity
@Table(name = "ufk_product")
public class UfkProductEntity implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PNO")
    private int pno;
    private Integer gno;
    @Basic
    @Column(name = "PNAME")
    private String pname;
    @Basic
    @Column(name = "Price")
    private Double price;
    @Basic
    @Column(name = "QTY")
    private Integer qty;
    //多对一关联关系
    @ManyToOne(fetch =FetchType.EAGER,cascade = CascadeType.REMOVE,targetEntity = ProductcategoryEntity.class)
    @JoinColumn(name = "GNO",insertable = false)
    private ProductcategoryEntity department = null;

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public Integer getGno() {
        return gno;
    }

    public void setGno(Integer gno) {
        this.gno = gno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

}
