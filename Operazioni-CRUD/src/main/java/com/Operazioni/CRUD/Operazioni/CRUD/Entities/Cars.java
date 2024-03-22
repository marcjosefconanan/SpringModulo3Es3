package com.Operazioni.CRUD.Operazioni.CRUD.Entities;

import jakarta.persistence.*;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String mobileName;
    @Column(nullable = false)
    private String serialNumber;
    @Column(nullable = false)
    private Double price;

    public Cars(Long id, String mobileName, String serialNumber, Double price) {
        this.id = id;
        this.mobileName = mobileName;
        this.serialNumber = serialNumber;
        this.price = price;
    }
    public Cars(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
