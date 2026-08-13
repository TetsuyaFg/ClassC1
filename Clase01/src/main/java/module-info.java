module pe.edu.upeu.clase01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pe.edu.upeu.clase01 to javafx.fxml;
    exports pe.edu.upeu.clase01;
}