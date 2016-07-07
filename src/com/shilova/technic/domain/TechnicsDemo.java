package com.shilova.technic.domain;

import java.math.BigDecimal;

public class TechnicsDemo {
    
    public static void main(String[] args){
        
        Notebook note = new Notebook();
        note.setDiagonal(22);
        note.setId(1);
        note.setName("acer g78");
        note.setPrice(new BigDecimal(7500.5));
        note.setProcessorBrand("Intel");
        note.setProducer("acer");
        note.setRAMcapacity(4);
        System.out.println(note.hashCode());
        System.out.println(note.toString());
        
        Notebook note2 = new Notebook(15, "Intel", 4, "HP", new BigDecimal(14990.0), "hp pavilion", 2);
        System.out.println(note2.toString());
        System.out.println(note2.hashCode());
        
        System.out.println(note.equals(note2));
               
        DesktopComputer desktop = new DesktopComputer();
        desktop.setId(3);
        desktop.setMonitorProducer("Samsung");
        desktop.setName("LG supadupa");
        desktop.setPrice(new BigDecimal(10220.0));
        desktop.setProcessorBrand("Intel");
        desktop.setProducer("LG");
        desktop.setRAMcapacity(6); 
        System.out.println(desktop.toString());
        System.out.println(desktop.hashCode());
               
        DesktopComputer desktop2 = new DesktopComputer("Philips", "AMD", 6, "ASUS", new BigDecimal("25699.9"), "AMADEY 456", 4);
        System.out.println(desktop2.hashCode());
        System.out.println(desktop2.toString());
        
        System.out.println(desktop.equals(desktop2));
        
    }
            
}
