package com.example.tikTacToe.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.image.Image;

import java.util.Random;

public class Model {
    Image cross;
    Image blank;
    Image circle;

    ObjectProperty<Image> firstCell;
    ObjectProperty<Image> secondCell;
    ObjectProperty<Image> thirdCell;
    ObjectProperty<Image> fourthCell;
    ObjectProperty<Image> fifthCell;
    ObjectProperty<Image> sixthCell;
    ObjectProperty<Image> seventhCell;
    ObjectProperty<Image> eighthCell;
    ObjectProperty<Image> ninthCell;

    Random rand = new Random();

    public Model() {
        cross = new Image(getClass().getResource("/com/example/ticTacToe/images/cross.png").toExternalForm());
        circle = new Image(getClass().getResource("/com/example/ticTacToe/images/circle.png").toExternalForm());
        blank = new Image(getClass().getResource("/com/example/ticTacToe/images/blank.png").toExternalForm());

        firstCell = new SimpleObjectProperty<>(blank);
        secondCell = new SimpleObjectProperty<>(blank);
        thirdCell = new SimpleObjectProperty<>(blank);
        fourthCell = new SimpleObjectProperty<>(blank);
        fifthCell = new SimpleObjectProperty<>(blank);
        sixthCell = new SimpleObjectProperty<>(blank);
        seventhCell = new SimpleObjectProperty<>(blank);
        eighthCell = new SimpleObjectProperty<>(blank);
        ninthCell = new SimpleObjectProperty<>(blank);





    }
}
