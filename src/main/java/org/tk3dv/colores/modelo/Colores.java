package org.tk3dv.colores.modelo;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Esta es la clase modelo de proyecto, en ella están definidos
 * los datos de la aplicación
 * @author Francisco Tortillol Molina & Carlos José Sanchez Carmona
 */
public class Colores {

    /*Declaro las variables del tipo Integer que contendrá cada uno de los
    * valores que en conjunto formaran cada item del ListView*/
    private Integer numR;
    private Integer numV;
    private Integer numA;
    private Rectangle rectangle;

    /**
     * Constructor de clase sin parámetros.
     */
    public Colores() {}

    /**
     * Crea una instancia de Colores, establece los atributos de los valores
     * pasados como parámetro e instancia un objeto de la clase Rectangle con
     * unas dimensiones de 30 ancho x 10 alto y le aplica el color definido
     * por los valores recibidos como parámetro.
     * @param numR recibe el valor numérico correspondiente al rojo
     *       en el código RGB
     * @param numV recibe el valor numérico correspondiente al verde
     *       en el código RGB
     * @param numA recibe el valor numérico correspondiente al azul
     *       en el código RGB
     */
    public Colores(Integer numR, Integer numV, Integer numA)
    {
        this.numR = numR;
        this.numV=numV;
        this.numA=numA;
        this.rectangle = new Rectangle(30,10,Color.rgb(numR,numV,numA));
    }

    /**
     *
     * @return numR, entero que representa el valor rojo
     *      en el código RGB
     */
    public int getNumR() {return numR;}
    /**
     *
     * @return numV, entero que representa el valor verde
     *      en el código RGB
     */
    public int getNumV() {return numV;}
    /**
     *
     * @return numA, entero que representa el valor azul
     *      en el código RGB
     */
    public int getNumA() {return numA;}

    /**
     *
     * @param numR, define el valor de esta variable de clase.
     */
    public void setNumR(int numR) {this.numR=numR;}
    /**
     *
     * @param numV, define el valor de esta variable de clase.
     */
    public void setNumV(int numV) {this.numV=numV;}
    /**
     *
     * @param numA, define el valor de esta variable de clase.
     */
    public void setNumA(int numA) {this.numA=numA;}

    /**
     *
     * @return Rectangle, devuelve la instancia de la clase Rectangle generada
     * en el constructor
     */
    public Rectangle getRectangle() {return rectangle;}

    /**
     * Sobreescribe el método toString que hereda de la clase Object,
     * le da un formato adecuado para su presentación en el ListView.
     * @return String Cadena de caracteres con el formato (RGB valor: valor: valor)
     */
    @Override
    public String toString() {return "RGB "+numR +" : "
            + numV +" : " + numA;}
}
