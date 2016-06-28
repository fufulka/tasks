package com.shilova.technic.domain;

import java.math.BigDecimal;

public abstract class Technics extends DomainObject{

    public Technics() {
        
    }

    public Technics(String producer, BigDecimal price, String name) {
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
        return  new StringBuilder(super.toString())
            .append(", Producer ").append(getProducer())
            .append(", Name ").append(getName())
            .append(", Price ").append(getPrice())
            .toString();                   
    }
    
}
