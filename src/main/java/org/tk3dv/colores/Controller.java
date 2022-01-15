package org.tk3dv.colores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
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

    int valorRojo, valorVerde, valorAzul;
    ObservableList<Colores>lista = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        sliderRojo.valueProperty().addListener((observableValue, number, t1) -> {
            valorRojo = (int) sliderRojo.getValue();
            lbRojo.setText(Integer.toString(valorRojo));


        });

        sliderVerde.valueProperty().addListener((observableValue, number, t1) -> {
            valorVerde=(int)sliderVerde.getValue();
            lbVerde.setText(Integer.toString(valorVerde));


        });

        sliderAzul.valueProperty().addListener((observableValue, number, t1) -> {
            valorAzul=(int)sliderAzul.getValue();
            lbAzul.setText(Integer.toString(valorAzul));
        });

    }


    @FXML
    void addValores(ActionEvent event) {
        Colores colores = new Colores(Integer.parseInt(lbRojo.getText()),
                                      Integer.parseInt(lbVerde.getText()),
                                      Integer.parseInt(lbAzul.getText())
        );
        lista.add(colores);
        lvColores.setItems(lista);


    }
}