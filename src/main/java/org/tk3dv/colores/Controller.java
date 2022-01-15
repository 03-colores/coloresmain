package org.tk3dv.colores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.tk3dv.colores.modelo.Colores;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Slider sliderAzul, sliderRojo, sliderVerde;

    @FXML
    private Label lbRojo, lbVerde, lbAzul;

    @FXML
    private ListView<Colores> lvColores;

    @FXML
    private Rectangle rectangulo;

    int valorRojo,valorAzul,valorVerde;
    ObservableList<Colores>lista = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        rectangulo.setFill(Color.rgb(0,0,0));

        sliderRojo.valueProperty().addListener((observableValue, number, t1) -> {

            lbRojo.setText(Integer.toString(valorRojo=(int)sliderRojo.getValue()));
            rectangulo.setFill(Color.rgb(valorRojo, valorVerde, valorAzul));


        });

        sliderVerde.valueProperty().addListener((observableValue, number, t1) -> {

            lbVerde.setText(Integer.toString(valorVerde=(int)sliderVerde.getValue()));
            rectangulo.setFill(Color.rgb(valorRojo, valorVerde, valorAzul));


        });

        sliderAzul.valueProperty().addListener((observableValue, number, t1) -> {
            lbAzul.setText(Integer.toString(valorAzul=(int)sliderAzul.getValue()));
            rectangulo.setFill(Color.rgb(valorRojo, valorVerde, valorAzul));


        });

    }


    @FXML
    void addValores(ActionEvent event) {
        Colores colores = new Colores(Integer.parseInt(lbRojo.getText()),
                                      Integer.parseInt(lbVerde.getText()),
                                      Integer.parseInt(lbAzul.getText())
        );
        lista.add(colores);
//        Iterator it = lista.iterator();
//        it.hasNext();it.next()
        lvColores.setItems(lista);


    }
}