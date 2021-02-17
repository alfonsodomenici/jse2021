module it.tss.javafxcounter {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.tss.javafxcounter to javafx.fxml;
    exports it.tss.javafxcounter;
}