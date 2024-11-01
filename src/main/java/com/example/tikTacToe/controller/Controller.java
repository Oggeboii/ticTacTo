package com.example.tikTacToe.controller;


import com.example.tikTacToe.model.Model;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


import static com.example.tikTacToe.Cells.*;

public class Controller {
    public BorderPane root;
    public VBox paneMenu;

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
        model.playerMove(FIRST);
    }

    public void cellSecondClicked(MouseEvent mouseEvent) {
        model.playerMove(SECOND);
    }
    public void cellThirdClicked(MouseEvent mouseEvent) {
        model.playerMove(THIRD);
    }
    public void cellFourthClicked(MouseEvent mouseEvent) {
        model.playerMove(FOURTH);
    }
    public void cellFifthClicked(MouseEvent mouseEvent) {
        model.playerMove(FIFTH);
    }
    public void cellSixthClicked(MouseEvent mouseEvent) {
        model.playerMove(SIXTH);
    }
    public void cellSeventhClicked(MouseEvent mouseEvent) {
        model.playerMove(SEVENTH);
    }
    public void cellEighthClicked(MouseEvent mouseEvent) {
        model.playerMove(EIGHTH);
    }
    public void cellNinthClicked(MouseEvent mouseEvent) {
        model.playerMove(NINTH);
    }

}
