package org.tk3dv.colores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;
import org.tk3dv.colores.modelo.Colores;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Clase controlador de la aplicacion según el
 * {@see}<a href="https://developer.mozilla.org/es/docs/Glossary/MVC">
 * patrón de diseño MVC.</a>
 * Es la encargada de manejar la lógica que actualiza el modelo y la vista.
 * @since 1.0
 * @author Francisco Tortillol Molina & Carlos José Sanchez Carmona
 * @see <a href="https://github.com/03-colores/coloresmain.git">Repositorio en GitHub</a>
  */
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
    private ObservableList<Colores>lista = FXCollections.observableArrayList();

    /**
     * Heredado de la interfaz Initializable.En el se inicializa el Listview y
     * se establece el color de relleno inicial del Rectangle, ademas de declararse
     * los métodos que se ejecutan al iniciarse y durante el tiempo de ejecución
     * de la app
     * @param url del la clase URL
     * @param resourceBundle del la clase ResourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        rectangulo.setFill(Color.rgb(0,0,0));
        lvColores.setItems(lista);
        gestionarSlider();
        customItemsListView();
        buttonBinderToItem();
    }

    /**
     * Enlaza la propiedad de la Clase Button que devuelve un valor boolean
     * en función de si está activo (true) o no (false) el botón eliminar con
     * la propiedad de cada item que forma parte del ListView devolviendo un
     * valor boolean en función de si este está seleccionado (true) o no lo esta
     * (false).
     */
    public void buttonBinderToItem(){
        btnEliminar.disableProperty().bind(lvColores.getSelectionModel().selectedItemProperty().isNull());
    }
    /**
     * Añade un objeto de la clase ChangeListener al valueProperty de cada Slider
     * este será notificado cada vez que su valor cambie.
     * Cuando esto suceda se establecera el texto mostrado por el Label
     * correspondiente con el valor recibido por la propiedad valueProperty del
     * slider.
     */
    public void gestionarSlider(){

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
    }
    /**
     * Customiza el aspecto de cada uno de los items que conforman el ListView
     * para ello hace uso de su método setCellFactory que permite personalizar
     * la instancia de ListCell encargada de darles un aspecto por defecto.
     * Mediante este método añade un objeto rectangle a cada item.
     */
    public void customItemsListView(){
        lvColores.setCellFactory(new Callback<ListView<Colores>, ListCell<Colores>>() {
            @Override
            public ListCell<Colores> call(ListView<Colores> param) {
                ListCell<Colores> mixto = new ListCell(){
                    @Override
                    protected void updateItem(Object item, boolean empty) {
                        super.updateItem(item, empty);
                        setText(null);
                        setGraphic(null);
                        Colores colores = ((Colores)item);
                        if(colores!=null){

                            setText(colores.toString());
                            setGraphic(colores.getRectangle());
                        }
                    }
                };
                return mixto;
            }
        });
    }
    /**
     * Crea una instancia de la clase modelo y la añade a la ObservableList que
     * compone los items del ListView.
     * @param event Recibe la notificación de que el botón ha sido pulsado.
     */
    @FXML
    void addValores(ActionEvent event) {
        Colores colores = new Colores(
                Integer.parseInt(lbRojo.getText()),
                Integer.parseInt(lbVerde.getText()),
                Integer.parseInt(lbAzul.getText())
        );
        lista.add(colores);
    }

    /**
     * Elimina el objeto de la lista que corresponde al indice del item
     * seleccionado.
     * @param event Recibe la notificación de que el botón ha sido pulsado.
     */
    @FXML
    void deleteValores(ActionEvent event) {
            lista.remove(lvColores.getSelectionModel().getSelectedIndex());
         }
    }
