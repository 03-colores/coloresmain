package org.tk3dv.colores;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    /*
    * En el metodo start que hereda la clase principal de la clase Application
    * Se instancia un objeto de la clase FXMLLoader al que se le indica por parametro
    * el nombre y la ubicación del fichero fxml, crea un Scene en el que carga mediante el método
    * load() de esa clase, FXMLLoader, dicho archivo y lo añade al Stage, finalmente muestra el Stage
    * con el método show()*/
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("ColoresView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 440);
        stage.setTitle("Colores");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
/*Inicia la aplicacion*/
    public static void main(String[] args) {
        launch();
    }
}