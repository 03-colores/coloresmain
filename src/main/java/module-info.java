module org.tk3dv.colores {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;

    opens org.tk3dv.colores to javafx.fxml;
    exports org.tk3dv.colores;
    exports org.tk3dv.colores.modelo;
    opens org.tk3dv.colores.modelo to javafx.fxml;
}