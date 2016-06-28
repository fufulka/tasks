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
public abstract class CompTech extends Technic {
    private String proc;
    private int ram;

    /**
     * @return the proc
     */
    public String getProc() {
        return proc;
    }

    /**
     * @param proc the proc to set
     */
    public void setProc(String proc) {
        this.proc = proc;
    }

    @Override
    public String toString() {
        return super.toString() + "proc=" + proc + ", ram=" + ram;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
}


