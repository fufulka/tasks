package com.shilova.technic.domain;

import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Юля
 */
public abstract class Technic extends DomainObject{

    public Technic() {
        
    }

    public Technic(String producer, BigDecimal price, String name) {
        this.producer = producer;
        this.price = price;
        this.name = name;
      
    }
    
    private String producer;
    private BigDecimal price;
    private String name;


    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getProducer() {
        return producer;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "# "+ getId() + " Producer " + getProducer() + " Price " + 
                getPrice() + " Name " + getName();
    }
    
}
