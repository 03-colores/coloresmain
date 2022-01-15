package org.tk3dv.colores;


import eu.hansolo.tilesfx.colors.ColorSkin;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.css.converter.ColorConverter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import org.tk3dv.colores.modelo.Colores;
import javafx.event.ActionEvent;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Slider sliderAzul, sliderRojo, sliderVerde;

    @FXML
    private Label lbRojo, lbVerde, lbAzul;

    @FXML
    private ListView<Colores> lvColores;

    int valor;
    ObservableList<Colores> lista = FXCollections.observableArrayList();

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