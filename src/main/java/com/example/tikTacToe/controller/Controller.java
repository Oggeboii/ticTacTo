package com.example.tikTacToe.controller;

import com.example.tikTacToe.Cells;
import com.example.tikTacToe.model.Model;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Cell;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


import static com.example.tikTacToe.Cells.*;

public class Controller {
    public BorderPane root;
    public HBox paneMenu;

    public void initialize() {
        startRandomEvent();

    }
    private void startRandomEvent(){
        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.millis(Math.random()*1000),
                        (ActionEvent event) ->{
                            model.update();
                            Controller.this.startRandomEvent();
                        }
                )
        );
        timeline.play();
    }


    private Model model = new Model();

    public Model getModel() {
        return model;
    }
    public void playerVsNPCClicked(MouseEvent mouseEvent) {
        paneMenu.setVisible(false);
        model.playerVsNPC();
    }

    public void playAgainClicked(MouseEvent mouseEvent) {
        model.playAgain();
    }
    public void backToMenuClicked(MouseEvent mouseEvent) {
        paneMenu.setVisible(true);
        model.resetAll();
    }

    public void cellFirstClicked(MouseEvent mouseEvent) {
        model.cellClicked(FIRST);
    }

    public void cellSecondClicked(MouseEvent mouseEvent) {
        model.cellClicked(SECOND);
    }
    public void cellThirdClicked(MouseEvent mouseEvent) {
        model.cellClicked(THIRD);
    }
    public void cellFourthClicked(MouseEvent mouseEvent) {
        model.cellClicked(FOURTH);
    }
    public void cellFifthClicked(MouseEvent mouseEvent) {
        model.cellClicked(FIFTH);
    }
    public void cellSixthClicked(MouseEvent mouseEvent) {
        model.cellClicked(SIXTH);
    }
    public void cellSeventhClicked(MouseEvent mouseEvent) {
        model.cellClicked(SEVENTH);
    }
    public void cellEighthClicked(MouseEvent mouseEvent) {
        model.cellClicked(EIGHTH);
    }
    public void cellNinthClicked(MouseEvent mouseEvent) {
        model.cellClicked(NINTH);
    }


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
