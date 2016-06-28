package com.shilova.technic.domain;

public class Notebook extends ComputerEquipment {
    
    private int diagonal;
    
    @Override
    public String toString(){
        return new StringBuilder(super.toString())
            .append(", Diagonal = ").append(getDiagonal())
            .toString();
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}
