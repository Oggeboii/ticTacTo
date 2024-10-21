package com.example.tikTacToe.controller;

import com.example.tikTacToe.Cells;
import com.example.tikTacToe.model.Model;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import static com.example.tikTacToe.Cells.*;

public class Controller {
    public void initialize() {
        startRandomEvent();

    }
    private void startRandomEvent(){
        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.millis(Math.random()*3000),
                        (ActionEvent event) ->{
                            model.npcMove();
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
