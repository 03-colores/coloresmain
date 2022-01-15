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

    @FXML
    private Rectangle shape;

    int valor;
    ObservableList<Colores> lista = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        sliderRojo.valueProperty().bind(shape.fillProperty().setValue());

//        shape.fillProperty().getValue();

        sliderRojo.valueProperty().addListener((observableValue, number, t1) -> {
            valor=(int)sliderRojo.getValue();
            lbRojo.setText(Integer.toString(valor));
          //  shape.setFill(Color.rgb(valor,0,0));

        });

        sliderVerde.valueProperty().addListener((observableValue, number, t1) -> {
            valor=(int)sliderVerde.getValue();
            lbVerde.setText(Integer.toString(valor));
           // shape.setFill(Color.rgb(0,valor,0));
        });

        sliderAzul.valueProperty().addListener((observableValue, number, t1) -> {
            valor=(int)sliderAzul.getValue();
            lbAzul.setText(Integer.toString(valor));
           // shape.setFill(Color.rgb(0,0,valor));
        });






    }

    public void addValores(ActionEvent event) {

        Colores colores = new Colores(Integer.parseInt(lbRojo.getText()),
                Integer.parseInt(lbVerde.getText()),
                Integer.parseInt(lbAzul.getText())
        );
        lista.add(colores);
        lvColores.setItems(lista);
    }
}