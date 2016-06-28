package com.shilova.technic.domain;

public abstract class ComputerEquipment extends Technics {
    private String processorBrand;
    private int RAMcapacity;

    public String getProcessorBrand() {
        return processorBrand;
    }

    public void setProcessorBrand(String processorBrand) {
        this.processorBrand = processorBrand;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
            .append(", Processor - ").append(getProcessorBrand())
            .append(", RAM - ").append(getRAMcapacity())
            .toString();
    }

    public int getRAMcapacity() {
        return RAMcapacity;
    }


    public void setRAMcapacity(int RAMcapacity) {
        this.RAMcapacity = RAMcapacity;
    }
    
    
}


