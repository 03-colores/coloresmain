package org.tk3dv.colores.modelo;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Colores {

    /*Declaro las variables del tipo Integer que contendrá cada uno de los
    * valores que en conjunto formaran cada item del ListView*/
    private Integer numR;
    private Integer numV;
    private Integer numA;
    private Rectangle rectangle;


    public Colores() {}


    public Colores(Integer numR, Integer numV, Integer numA)
    {
        this.numR = numR;
        this.numV=numV;
        this.numA=numA;
        this.rectangle = new Rectangle(30,10,Color.rgb(numR,numV,numA));
    }


    public int getNumR() {return numR;}
    public int getNumV() {return numV;}
    public int getNumA() {return numA;}

    public void setNumR(int numR) {this.numR=numR;}
    public void setNumV(int numV) {this.numV=numV;}
    public void setNumA(int numA) {this.numA=numA;}


    public Rectangle getRectangle() {return rectangle;}

    @Override
    public String toString() {return "RGB "+numR +" : "
            + numV +" : " + numA;}
}
