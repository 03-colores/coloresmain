package org.tk3dv.colores.modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.shape.Rectangle;

public class Colores {
    /*Declaro las variable del tipo IntegerProperty que contendra cada uno de los
    * valores que en conjunto formaran cada item del ListView*/
    private final IntegerProperty numR = new SimpleIntegerProperty( this, "numR",0);
    private final IntegerProperty numV = new SimpleIntegerProperty( this, "numV",0);
    private final IntegerProperty numA = new SimpleIntegerProperty( this, "numA",0);
    private Rectangle rectangle;


    public Colores() {}

    public Colores(Rectangle rectangle,Integer numR, Integer numV, Integer numA) {
        this.numR.set(numR);
        this.numV.set(numV);
        this.numA.set(numA);
        this.rectangle = rectangle;
    }
    public int getNumR() {return numR.get();}
    public IntegerProperty numRProperty() {return numR;}
    public void setNumR(int numR) {this.numR.set(numR);}
    public int getNumV() {return numV.get();}
    public IntegerProperty numVProperty() {return numV;}
    public void setNumV(int numV) {this.numV.set(numV);}
    public int getNumA() {return numA.get();}
    public IntegerProperty numAProperty() {return numA;}
    public void setNumA(int numA) {this.numA.set(numA);}
    public Rectangle getRectangle() {return rectangle;}
    public void setRectangle(Rectangle rectangle) {this.rectangle = rectangle;}
    @Override
    public String toString() {return "RGB "+numR.get() +" : "+ numV.get() +" : " + numA.get();}
}
