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
public class Notebook extends CompTech {
    
    private int diagonal;
    
    @Override
    public String toString(){
        return super.toString() + 
                " Diagonal = " + getDiagonal();
    }

    /**
     * @return the diagonal
     */
    public int getDiagonal() {
        return diagonal;
    }

    /**
     * @param diagonal the diagonal to set
     */
    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}
