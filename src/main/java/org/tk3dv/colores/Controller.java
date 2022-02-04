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
import javafx.scene.shape.Rectangle;
import org.tk3dv.colores.modelo.Colores;
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
    private Rectangle rectangulo;
    @FXML
    private Button btnEliminar;
    private int valorRojo,valorAzul,valorVerde;
    ObservableList<Colores>lista = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        rectangulo.setFill(Color.rgb(0,0,0));
        lvColores.setItems(lista);
        /*
        * Se añade un Listener a cada uno de los slider, que cambia el texto
        * de la etiqueta correspondiente */

        sliderRojo.valueProperty().addListener((observableValue, number, t1) -> {
            lbRojo.setText(Integer.toString(valorRojo= t1.intValue()));
            rectangulo.setFill(Color.rgb(valorRojo, valorVerde, valorAzul));
        });

        sliderVerde.valueProperty().addListener((observableValue, number, t1) -> {
            lbVerde.setText(Integer.toString(valorVerde= t1.intValue()));
            rectangulo.setFill(Color.rgb(valorRojo, valorVerde, valorAzul));
        });

        sliderAzul.valueProperty().addListener((observableValue, number, t1) -> {
            lbAzul.setText(Integer.toString(valorAzul= t1.intValue()));
            rectangulo.setFill(Color.rgb(valorRojo, valorVerde, valorAzul));
        });
        /*Enlaza la propiedad desactivar del boton 'Eliminar' con la propiedad de los
        * item del ListView que comprueba que esta seleccionado para mantener el botón
        * desactivado mientras no se seleccione un item del ListView */
        btnEliminar.disableProperty().bind(lvColores.getSelectionModel().selectedItemProperty().isNull());

    }


    @FXML
    void addValores(ActionEvent event) {
        //obtencion de los valores de los slider para crear un colores y añadirlo a la lista y 1vColores
        Colores colores = new Colores(
                Integer.parseInt(lbRojo.getText()),
                Integer.parseInt(lbVerde.getText()),
                Integer.parseInt(lbAzul.getText())
        );
        lista.add(colores);
    }

    @FXML
    void deleteValores(ActionEvent event) {
            //obtener el index de la seleccion de 1vColores para eleminarlo de la lista
            lista.remove(lvColores.getSelectionModel().getSelectedIndex());
         }
    }
