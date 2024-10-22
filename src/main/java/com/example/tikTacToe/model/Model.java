package com.example.tikTacToe.model;

import com.example.tikTacToe.Cells;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.example.tikTacToe.Cells.*;
import static com.example.tikTacToe.model.Player.*;

public class Model {
    Random rand = new Random();
    private final List <Cells> availableCells = new ArrayList<>();

    private int scoreP1 = 0;
    private int scoreP2 = 0;

    private StringProperty player1 = new SimpleStringProperty("Player1");
    private StringProperty player2 = new SimpleStringProperty("Player2");

    private Player currentPlayer;
    private StringProperty scoringP1 = new SimpleStringProperty("0 Poäng");
    private StringProperty scoringP2 = new SimpleStringProperty("0 Poäng");

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

    public Model() {
        currentPlayer = PLAYER1;

        cross = new Image(getClass().getResource("/com/example/tikTacToe/images/cross.png").toExternalForm());
        circle = new Image(getClass().getResource("/com/example/tikTacToe/images/circle.png").toExternalForm());
        blank = new Image(getClass().getResource("/com/example/tikTacToe/images/blank.png").toExternalForm());

        firstCell = new SimpleObjectProperty<>(blank);
        secondCell = new SimpleObjectProperty<>(blank);
        thirdCell = new SimpleObjectProperty<>(blank);
        fourthCell = new SimpleObjectProperty<>(blank);
        fifthCell = new SimpleObjectProperty<>(blank);
        sixthCell = new SimpleObjectProperty<>(blank);
        seventhCell = new SimpleObjectProperty<>(blank);
        eighthCell = new SimpleObjectProperty<>(blank);
        ninthCell = new SimpleObjectProperty<>(blank);
        availableCells.addAll(Arrays.asList(FIRST,SECOND,THIRD,FOURTH,FIFTH,SIXTH,SEVENTH,EIGHTH,NINTH));
    }

    public void update(){
        npcMove();
        isWinning();
    }


    public String getPlayer1() {
        return player1.get();
    }

    public StringProperty player1Property() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1.set(player1);
    }

    public String getPlayer2() {
        return player2.get();
    }

    public StringProperty player2Property() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2.set(player2);
    }

    public String getScoringP1() {
        return scoringP1.get();
    }

    public StringProperty scoringP1Property() {
        return scoringP1;
    }

    public void setScoringP1(String scoringP1) {
        this.scoringP1.set(scoringP1);
    }

    public String getScoringP2() {
        return scoringP2.get();
    }

    public StringProperty scoringP2Property() {
        return scoringP2;
    }

    public void setScoringP2(String scoringP2) {
        this.scoringP2.set(scoringP2);
    }

    public Image getFirstCell() {
        return firstCell.get();
    }

    public ObjectProperty<Image> firstCellProperty() {
        return firstCell;
    }

    public void setFirstCell(Image firstCell) {
        this.firstCell.set(firstCell);
    }

    public Image getSecondCell() {
        return secondCell.get();
    }

    public ObjectProperty<Image> secondCellProperty() {
        return secondCell;
    }

    public void setSecondCell(Image secondCell) {
        this.secondCell.set(secondCell);
    }

    public Image getThirdCell() {
        return thirdCell.get();
    }

    public ObjectProperty<Image> thirdCellProperty() {
        return thirdCell;
    }

    public void setThirdCell(Image thirdCell) {
        this.thirdCell.set(thirdCell);
    }

    public Image getFourthCell() {
        return fourthCell.get();
    }

    public ObjectProperty<Image> fourthCellProperty() {
        return fourthCell;
    }

    public void setFourthCell(Image fourthCell) {
        this.fourthCell.set(fourthCell);
    }

    public Image getFifthCell() {
        return fifthCell.get();
    }

    public ObjectProperty<Image> fifthCellProperty() {
        return fifthCell;
    }

    public void setFifthCell(Image fifthCell) {
        this.fifthCell.set(fifthCell);
    }

    public Image getSixthCell() {
        return sixthCell.get();
    }

    public ObjectProperty<Image> sixthCellProperty() {
        return sixthCell;
    }

    public void setSixthCell(Image sixthCell) {
        this.sixthCell.set(sixthCell);
    }

    public Image getSeventhCell() {
        return seventhCell.get();
    }

    public ObjectProperty<Image> seventhCellProperty() {
        return seventhCell;
    }

    public void setSeventhCell(Image seventhCell) {
        this.seventhCell.set(seventhCell);
    }

    public Image getEighthCell() {
        return eighthCell.get();
    }

    public ObjectProperty<Image> eighthCellProperty() {
        return eighthCell;
    }

    public void setEighthCell(Image eighthCell) {
        this.eighthCell.set(eighthCell);
    }

    public Image getNinthCell() {
        return ninthCell.get();
    }

    public ObjectProperty<Image> ninthCellProperty() {
        return ninthCell;
    }

    public void setNinthCell(Image ninthCell) {
        this.ninthCell.set(ninthCell);
    }

    public Cells npcCellChoice() {

        int index = rand.nextInt(availableCells.size());
        Cells cell = availableCells.get(index);
        availableCells.remove(index);
        return cell;
    }

    public void npcMove(){
        if(currentPlayer == NPC)
            cellClicked(npcCellChoice());
    }

    public void cellClicked(Cells cells){
        if (cells == FIRST && getFirstCell()== blank){
            if(currentPlayer == PLAYER1) {
                setFirstCell(cross);
                currentPlayer = NPC;
            }
            else if(currentPlayer == NPC){
                setFirstCell(circle);
                currentPlayer = PLAYER1;
            }
        }

        else if(cells == Cells.SECOND && getSecondCell()== blank){
            if(currentPlayer == PLAYER1) {
                setSecondCell(cross);
                currentPlayer = NPC;
            }
            else if(currentPlayer == NPC){
                setSecondCell(circle);
                currentPlayer = PLAYER1;
            }
        }

        else if(cells == Cells.THIRD && getThirdCell()== blank){
            if(currentPlayer == PLAYER1) {
                setThirdCell(cross);
                currentPlayer = NPC;
            }
            else if(currentPlayer == NPC){
                setThirdCell(circle);
                currentPlayer = PLAYER1;
            }
        }

        else if(cells == Cells.FOURTH && getFourthCell()== blank){
            if (currentPlayer == PLAYER1) {
                setFourthCell(cross);
                currentPlayer = NPC;
            }
            else if (currentPlayer == NPC){
                setFourthCell(circle);
                currentPlayer = PLAYER1;
            }
        }

        else if(cells == Cells.FIFTH && getFifthCell()== blank){
            if (currentPlayer == PLAYER1) {
                setFifthCell(cross);
                currentPlayer = NPC;
            }
            else if (currentPlayer == NPC){
                setFifthCell(circle);
                currentPlayer = PLAYER1;
            }
        }

        else if(cells == Cells.SIXTH && getSixthCell()== blank){
            if (currentPlayer == PLAYER1) {
                setSixthCell(cross);
                currentPlayer = NPC;
            }
            else if (currentPlayer == NPC){
                setSixthCell(circle);
                currentPlayer = PLAYER1;
            }
        }

        else if(cells == Cells.SEVENTH && getSeventhCell()== blank){
            if (currentPlayer == PLAYER1) {
                setSeventhCell(cross);
                currentPlayer = NPC;
            }
            else if (currentPlayer == NPC){
                setSeventhCell(circle);
                currentPlayer = PLAYER1;
            }
        }

        else if(cells == Cells.EIGHTH && getEighthCell()== blank){
            if (currentPlayer == PLAYER1) {
                setEighthCell(cross);
                currentPlayer = NPC;
            }
            else if (currentPlayer == NPC){
                setEighthCell(circle);
                currentPlayer = PLAYER1;
            }
        }
        else if(cells == Cells.NINTH && getNinthCell()== blank){
            if (currentPlayer == PLAYER1) {
                setNinthCell(cross);
                currentPlayer = NPC;
            }
            else if (currentPlayer == NPC){
                setNinthCell(circle);
                currentPlayer = PLAYER1;
            }
        }
        availableCells.remove(cells);
        isWinning();

    }

    public void resetBoard(){
        availableCells.addAll(Arrays.asList(FIRST,SECOND,THIRD,FOURTH,FIFTH,SIXTH,SEVENTH,EIGHTH,NINTH));
        setFirstCell(blank);
        setSecondCell(blank);
        setThirdCell(blank);
        setFourthCell(blank);
        setFifthCell(blank);
        setSixthCell(blank);
        setSeventhCell(blank);
        setEighthCell(blank);
        setNinthCell(blank);
    }

    public void isWinning(){
        if (isCross()) {
            scoreP1++;
            setScoringP1(scoreP1 + " Poäng");
            resetBoard();
        }
        else if (isCircle()) {
            scoreP2++;
            setScoringP2(scoreP2 + " Poäng");
            resetBoard();
        }
        else if(availableCells.isEmpty()){
            resetBoard();
        }

    }

    public boolean isCross(){
        if (checkRows(cross))
            return true;
        else if (checkColumns(cross)) {
            return true;
        } else if (checkDiagonal(cross)) {
            return true;
        }
        return false;
    }

    public boolean isCircle(){
        if (checkRows(circle))
            return true;
        else if (checkColumns(circle)) {
            return true;
        } else if (checkDiagonal(circle)) {
            return true;
        }
        return false;
    }

    private boolean checkRows(Image image) {
        if (getFirstCell().equals(image) && getSecondCell().equals(image) && getThirdCell().equals(image)){
          return true;
        } else if (getFourthCell().equals(image) && getFifthCell().equals(image) && getSixthCell().equals(image)){
            return true;
        } else if (getSeventhCell().equals(image) && getEighthCell().equals(image) && getNinthCell().equals(image)) {
            return true;
        }
        return false;
    }

    private boolean checkColumns(Image image) {
        if (getFirstCell().equals(image) && getFourthCell().equals(image) && getSeventhCell().equals(image)){
            return true;
        } else if (getSecondCell().equals(image) && getFifthCell().equals(image) && getEighthCell().equals(image)){
            return true;
        } else if (getThirdCell().equals(image) && getSixthCell().equals(image) && getNinthCell().equals(image)) {
            return true;
        }
        return false;
    }

    private boolean checkDiagonal(Image image) {
    if (getFirstCell().equals(image) && getFifthCell().equals(image) && getNinthCell().equals(image)) {
        return true;
    } else if (getThirdCell().equals(image) && getFifthCell().equals(image) && getSeventhCell().equals(image)) {
        return true;
    }
    return false;
    }
}
