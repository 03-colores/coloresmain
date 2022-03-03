package org.tk3dv.colores;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal, utilizando JavaFX, crea un selector de colores utilizando
 * sliders
 * @since 1.0
 * @author Francisco Tortillol Molina & Carlos José Sanchez Carmona
 * @see <a href="https://github.com/03-colores/coloresmain.git">Repositorio en GitHub</a>
 */
public class Application extends javafx.application.Application {

    /**
     * Carga los parámetros de la vista definidos en el archivo fxml los
     * cuales pasaran a ser uno de los parámetros de una instancia del objeto
     * de la clase Scene, junto con sus dimensiones.
     *
     * @param stage Recibe una instancia de la clase Scene y se muestra.
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("ColoresView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 440);
        stage.setTitle("Colores");
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal de la aplicación
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}