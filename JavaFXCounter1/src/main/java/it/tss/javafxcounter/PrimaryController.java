package it.tss.javafxcounter;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    Label lbl;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void onTest(ActionEvent e){
        System.out.println("OnTest ok...");
        lbl.setText("cambiata dal click...");
    }
}
