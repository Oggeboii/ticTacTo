package com.example.tikTacToe.model;

import com.example.tikTacToe.Cells;
import com.example.tikTacToe.controller.Controller;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.example.tikTacToe.Cells.*;
import static com.example.tikTacToe.model.GameState.*;
import static com.example.tikTacToe.model.Player.*;

public class Model {
    Random rand = new Random();
    private final List<Cells> availableCells = new ArrayList<>();
    private ListProperty<Image> images = new SimpleListProperty<>(FXCollections.observableArrayList());

    GameState gameState = RUNNING;

    private int scoreP1 = 0;
    private int scoreP2 = 0;

    private StringProperty player1 = new SimpleStringProperty("Player1");
    private StringProperty player2 = new SimpleStringProperty("Player2");

    private Player currentPlayer;
    private final StringProperty scoringP1 = new SimpleStringProperty("0 Poäng");
    private final StringProperty scoringP2 = new SimpleStringProperty("0 Poäng");

    Image cross;
    Image blank;
    Image circle;

    public Model() {
        currentPlayer = PLAYER1;

        cross = new Image(getClass().getResource("/com/example/tikTacToe/images/cross.png").toExternalForm());
        circle = new Image(getClass().getResource("/com/example/tikTacToe/images/circle.png").toExternalForm());
        blank = new Image(getClass().getResource("/com/example/tikTacToe/images/blank.png").toExternalForm());

        images.addFirst(blank);
        images.add(1, blank);
        images.add(2, blank);
        images.add(3, blank);
        images.add(4, blank);
        images.add(5, blank);
        images.add(6, blank);
        images.add(7, blank);
        images.add(8, blank);

        availableCells.addAll(Arrays.asList(FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH));
    }


    public void playerVsNPC(){

    }


    public ObservableList<Image> getImages() {
        return images.get();
    }

    public ListProperty<Image> imagesProperty() {
        return images;
    }

    public void setImages(ObservableList<Image> images) {
        this.images.set(images);
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

    public void playAgain() {
        resetBoard();
        gameState = RUNNING;
    }

    public void update() {
        if(gameState == RUNNING) {
            isWinning();
            npcMove();
        }
    }

    public Cells npcCellChoice() {

        int index = rand.nextInt(availableCells.size());
        Cells cell = availableCells.get(index);
        availableCells.remove(index);
        return cell;
    }


    public void npcMove() {
        if (currentPlayer == NPC)
            cellClicked(npcCellChoice());
    }

    public void cellClicked(Cells cells) {
        if (gameState == RUNNING) {
            if (cells == FIRST && images.getFirst() == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(0, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(0, circle);
                    currentPlayer = PLAYER1;
                }
            } else if (cells == SECOND && images.get(1) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(1, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(1, circle);
                    currentPlayer = PLAYER1;
                }
            } else if (cells == THIRD && images.get(2) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(2, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(2, circle);
                    currentPlayer = PLAYER1;
                }
            } else if (cells == FOURTH && images.get(3) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(3, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(3, circle);
                    currentPlayer = PLAYER1;
                }
            } else if (cells == FIFTH && images.get(4) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(4, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(4, circle);
                    currentPlayer = PLAYER1;
                }
            } else if (cells == SIXTH && images.get(5) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(5, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(5, circle);
                    currentPlayer = PLAYER1;
                }
            } else if (cells == SEVENTH && images.get(6) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(6, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(6, circle);
                    currentPlayer = PLAYER1;
                }
            } else if (cells == EIGHTH && images.get(7) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(7, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(7, circle);
                    currentPlayer = PLAYER1;
                }
            } else if (cells == NINTH && images.get(8) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(8, cross);
                    currentPlayer = NPC;
                } else if (currentPlayer == NPC) {
                    images.set(8, circle);
                    currentPlayer = PLAYER1;
                }
            }
            availableCells.remove(cells);
        }
    }

    public void resetBoard() {
        availableCells.addAll(Arrays.asList(FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH));
        images.set(0, blank);
        images.set(1, blank);
        images.set(2, blank);
        images.set(3, blank);
        images.set(4, blank);
        images.set(5, blank);
        images.set(6, blank);
        images.set(7, blank);
        images.set(8, blank);
    }

    public void isWinning() {
        if (isCross()) {
            gameState = PAUSED;
            scoreP1 = scoreP1 +1;
            setScoringP1(scoreP1 + " Poäng");
        }
        else if (isCircle()) {
            gameState = PAUSED;
            scoreP2 = scoreP2 +1;
            setScoringP2(scoreP2 + " Poäng");
        }
        else if (availableCells.isEmpty()) {
            gameState = PAUSED;
        }
    }

    public boolean isCross() {
        if (checkRows(cross))
            return true;
        else if (checkColumns(cross)) {
            return true;
        } else if (checkDiagonal(cross)) {
            return true;
        }
        return false;
    }

    public boolean isCircle() {
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
        if (images.getFirst().equals(image) && images.get(1).equals(image) && images.get(2).equals(image)) {
            return true;
        } else if (images.get(3).equals(image) && images.get(4).equals(image) && images.get(5).equals(image)) {
            return true;
        } else if (images.get(6).equals(image) && images.get(7).equals(image) && images.get(8).equals(image)) {
            return true;
        }
        return false;
    }

    private boolean checkColumns(Image image) {
        if (images.get(0).equals(image) && images.get(3).equals(image) && images.get(6).equals(image)) {
            return true;
        } else if (images.get(1).equals(image) && images.get(4).equals(image) && images.get(7).equals(image)) {
            return true;
        } else if (images.get(2).equals(image) && images.get(5).equals(image) && images.get(8).equals(image)) {
            return true;
        }
        return false;
    }

    private boolean checkDiagonal(Image image) {
        if (images.get(0).equals(image) && images.get(4).equals(image) && images.get(8).equals(image)) {
            return true;
        } else if (images.get(2).equals(image) && images.get(4).equals(image) && images.get(6).equals(image)) {
            return true;
        }
        return false;
    }

}
