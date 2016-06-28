/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shilova.technic.domain;

/**
 *
 * @author Юля
 */
public class Desktop extends CompTech {

    private String monitorProducer;
    
    @Override
    public String toString() {       
        return super.toString() + "monitorProducer=" + monitorProducer;
    }

    public String getMonitorProducer() {
        return monitorProducer;
    }

    public void setMonitorProducer(String monitorProducer) {
        this.monitorProducer = monitorProducer;
    }
    
    
}
