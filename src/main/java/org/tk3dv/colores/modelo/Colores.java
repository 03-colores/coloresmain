package org.tk3dv.colores.modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Colores {

    private final IntegerProperty numR = new SimpleIntegerProperty( this, "numR",0);
    private final IntegerProperty numV = new SimpleIntegerProperty( this, "NumV",0);
    private final IntegerProperty numA = new SimpleIntegerProperty( this, "numA",0);


    public Colores() {}

    public Colores(Integer numR, Integer numV, Integer numA) {

        this.numR.set(numR);
        this.numV.set(numV);
        this.numA.set(numA);
    }

    public int getNumR() {
        return numR.get();
    }

    public IntegerProperty numRProperty() {
        return numR;
    }

    public void setNumR(int numR) {
        this.numR.set(numR);
    }

    public int getNumV() {
        return numV.get();
    }

    public IntegerProperty numVProperty() {
        return numV;
    }

    public void setNumV(int numV) {
        this.numV.set(numV);
    }

    public int getNumA() {
        return numA.get();
    }

    public IntegerProperty numAProperty() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA.set(numA);
    }

    @Override
    public String toString() {return numR.get() +","+ numV.get() +"," + numA.get();}
}
