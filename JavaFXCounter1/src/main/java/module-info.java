module it.tss.javafxcounter1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.tss.javafxcounter1 to javafx.fxml;
    exports it.tss.javafxcounter1;
}