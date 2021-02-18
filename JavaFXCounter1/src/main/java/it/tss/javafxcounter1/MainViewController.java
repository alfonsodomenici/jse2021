package it.tss.javafxcounter1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainViewController {

    private int valore = 0;
    
    @FXML
    private Label result;
    
    @FXML
    public void onIncrementa(ActionEvent e){
        valore++;
        result.setText(String.valueOf(valore));
    }
    
    @FXML
    public void onDecrementa(ActionEvent e){
        valore--;
        result.setText(String.valueOf(valore));
    }
    
}
