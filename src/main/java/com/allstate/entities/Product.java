package com.allstate.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
public class Product {
    private int id;
    private int version;
    private String name;
    private String stocknumber;
    private int rating;
    private int numberofview;
    private float listprice;
    private int percentoff;
    private float actualprice;
    private int quantity;
    private boolean isrestricted;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Version
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
