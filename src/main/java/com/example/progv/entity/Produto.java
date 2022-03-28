package com.example.progv.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue
    private Long productId;

    @Column
    private String productName;

    public void setProductName(String productName) { this.productName = productName; }

    public String getProductName() { return productName; }

    public void setProductId(Long productId) { this.productId = productId; }

    public Long getProductId() { return productId; }
}
