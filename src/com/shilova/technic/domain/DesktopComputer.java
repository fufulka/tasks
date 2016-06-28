
package com.shilova.technic.domain;

public class DesktopComputer extends ComputerEquipment {

    private String monitorProducer;
    
    @Override
    public String toString() {       
        return new StringBuilder(super.toString())
            .append(", Monitor - ").append(getMonitorProducer())
            .toString();
    }

    public String getMonitorProducer() {
        return monitorProducer;
    }

    public void setMonitorProducer(String monitorProducer) {
        this.monitorProducer = monitorProducer;
    }
    
    
}
