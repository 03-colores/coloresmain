package org.tk3dv.colores;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Slider sliderAzul, sliderRojo, sliderVerde;

    @FXML
    private Label lbRojo, lbVerde, lbAzul;

    int valor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        sliderRojo.valueProperty().addListener((observableValue, number, t1) -> {
            valor=(int)sliderRojo.getValue();
            lbRojo.setText(Integer.toString(valor));

        });

        sliderVerde.valueProperty().addListener((observableValue, number, t1) -> {
            valor=(int)sliderVerde.getValue();
            lbVerde.setText(Integer.toString(valor));

        });

        sliderAzul.valueProperty().addListener((observableValue, number, t1) -> {
            valor=(int)sliderAzul.getValue();
            lbAzul.setText(Integer.toString(valor));

        });



    }
}