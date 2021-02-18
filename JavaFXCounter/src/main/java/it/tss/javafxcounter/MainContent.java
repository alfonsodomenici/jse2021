/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.javafxcounter;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 *
 * @author tss
 */
public class MainContent extends BorderPane {

    private final Button btnPlus;
    private final Button btnMinus;
    private final Label result;
    private final HBox hbox;
    private int valore;

    public MainContent() {
        valore = 0;
        hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        btnPlus = new Button("incr");
        btnMinus = new Button("decr");
        btnMinus.setDisable(true);
        result = new Label("0");
        btnPlus.setOnAction(this::onIncrementa);
        btnMinus.setOnAction(this::onDecrementa);
        result.setTextFill(Color.GREEN);
        hbox.getChildren().addAll(btnPlus, btnMinus, result);
        this.setCenter(hbox);
    }

    private void onIncrementa(ActionEvent e) {
        result.setText(String.valueOf(++valore));
        btnMinus.setDisable(false);
    }

    private void onDecrementa(ActionEvent e) {
        result.setText(String.valueOf(--valore));
        btnMinus.setDisable(valore == 0);
    }

}
