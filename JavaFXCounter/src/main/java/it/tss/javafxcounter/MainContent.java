/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.javafxcounter;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author tss
 */
public class MainContent extends BorderPane {

    private final Button btnPlus;
    private final Button btnMinus;
    private final Label result;
    private final HBox hbox;

    public MainContent() {
        hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        btnPlus = new Button("incr");
        btnMinus = new Button("decr");
        btnMinus.setDisable(true);
        btnPlus.setOnAction(this::onIncrementa);
        btnMinus.setOnAction(this::onDecrementa);
        btnPlus.setOnMouseEntered(this::onMouseEntered);
        btnPlus.setOnMouseExited(this::onMouseExited);
        btnMinus.setOnMouseEntered(this::onMouseEntered);
        btnMinus.setOnMouseExited(this::onMouseExited);

        result = new Label("0");
        result.setTextFill(Color.GREEN);
        hbox.getChildren().addAll(btnPlus, btnMinus, result);
        this.setCenter(hbox);
    }

    private void onIncrementa(ActionEvent e) {
        result.setText(String.valueOf(Integer.parseInt(result.getText()) + 1));
        btnMinus.setDisable(false);
    }

    private void onDecrementa(ActionEvent e) {
        result.setText(String.valueOf(Integer.parseInt(result.getText()) - 1));
        btnMinus.setDisable(Integer.valueOf(result.getText()) == 0);
    }

    private void onMouseEntered(MouseEvent e) {
        ((Button) e.getSource()).setBackground(new Background(new BackgroundFill(Paint.valueOf("RED"), CornerRadii.EMPTY.EMPTY, Insets.EMPTY)));
    }

    private void onMouseExited(MouseEvent e) {
        ((Button) e.getSource()).setBackground(null);
    }
}
