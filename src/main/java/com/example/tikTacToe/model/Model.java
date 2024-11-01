package com.example.tikTacToe.model;

import com.example.tikTacToe.Cells;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.example.tikTacToe.Cells.*;
import static com.example.tikTacToe.model.GameState.*;
import static com.example.tikTacToe.model.Player.*;

public class Model {
    private final StringProperty scoringP1 = new SimpleStringProperty("0 Poäng");
    private final StringProperty scoringP2 = new SimpleStringProperty("0 Poäng");
    public List<Cells> availableCells = new ArrayList<>();
    GameState gameState = PAUSED;
    Image cross;
    Image blank;
    Image circle;
    private Random rand = new Random();
    private ListProperty<Image> images = new SimpleListProperty<>(FXCollections.observableArrayList());
    private int scoreP1 = 0;
    private int scoreP2 = 0;
    private StringProperty winner = new SimpleStringProperty("");
    private StringProperty player1 = new SimpleStringProperty("Player1");
    private StringProperty player2 = new SimpleStringProperty("Player2");
    private Player currentPlayer;

    public Model() {
        currentPlayer = PLAYER1;

        cross = new Image(getClass().getResource("/com/example/tikTacToe/images/cross.png").toExternalForm());
        circle = new Image(getClass().getResource("/com/example/tikTacToe/images/circle.png").toExternalForm());
        blank = new Image(getClass().getResource("/com/example/tikTacToe/images/blank.png").toExternalForm());

        addBlankToAll();

        availableCells.addAll(Arrays.asList(FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH));
    }

    public ObservableList<Image> getImages() {
        return images.get();
    }

    public void setImages(ObservableList<Image> images) {
        this.images.set(images);
    }

    public ListProperty<Image> imagesProperty() {
        return images;
    }

    public String getPlayer1() {
        return player1.get();
    }

    public void setPlayer1(String player1) {
        this.player1.set(player1);
    }

    public StringProperty player1Property() {
        return player1;
    }

    public String getPlayer2() {
        return player2.get();
    }

    public void setPlayer2(String player2) {
        this.player2.set(player2);
    }

    public StringProperty player2Property() {
        return player2;
    }

    public String getScoringP1() {
        return scoringP1.get();
    }

    public void setScoringP1(String scoringP1) {
        this.scoringP1.set(scoringP1);
    }

    public StringProperty scoringP1Property() {
        return scoringP1;
    }

    public String getScoringP2() {
        return scoringP2.get();
    }

    public void setScoringP2(String scoringP2) {
        this.scoringP2.set(scoringP2);
    }

    public StringProperty scoringP2Property() {
        return scoringP2;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public String getWinner() {
        return winner.get();
    }

    public void setWinner(String winner) {
        this.winner.set(winner);
    }

    public StringProperty winnerProperty() {
        return winner;
    }

    public void playerVsNPC() {
        currentPlayer = PLAYER1;
        setPlayer2("NPC");
        gameState = RUNNING;
    }

    public void playAgain() {
        setWinner("");
        resetBoard();
        gameState = RUNNING;
    }

    public void resetAll() {
        gameState = PAUSED;
        scoreP1 = 0;
        scoreP2 = 0;
        setScoringP1(scoreP1 + " Poäng");
        setScoringP2(scoreP2 + " Poäng");
        availableCells.clear();

        resetBoard();
    }

    public void resetBoard() {
        availableCells.addAll(Arrays.asList(FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH, EIGHTH, NINTH));
        images.removeAll();
        addBlankToAll();
    }

    private void addBlankToAll() {
        for (int i = 0; i < 9; i++) {
            images.add(i, blank);
        }
    }

    public void update() {
        if (gameState == RUNNING) {
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
        if (currentPlayer == NPC && gameState == RUNNING)
            cellClicked(npcCellChoice());
    }
    public void playerMove(Cells cells){
        if (currentPlayer == PLAYER1 && gameState == RUNNING) {
            cellClicked(cells);
        }
    }


    public void cellClicked(Cells cells) {
        if (gameState == RUNNING) {

            if (cells == FIRST && images.getFirst() == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(0, cross);
                } else if (currentPlayer == NPC) {
                    images.set(0, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();

            } else if (cells == SECOND && images.get(1) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(1, cross);
                } else if (currentPlayer == NPC) {
                    images.set(1, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();

            } else if (cells == THIRD && images.get(2) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(2, cross);
                } else if (currentPlayer == NPC) {
                    images.set(2, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();

            } else if (cells == FOURTH && images.get(3) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(3, cross);
                } else if (currentPlayer == NPC) {
                    images.set(3, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();

            } else if (cells == FIFTH && images.get(4) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(4, cross);
                } else if (currentPlayer == NPC) {
                    images.set(4, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();

            } else if (cells == SIXTH && images.get(5) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(5, cross);
                } else if (currentPlayer == NPC) {
                    images.set(5, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();

            } else if (cells == SEVENTH && images.get(6) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(6, cross);
                } else if (currentPlayer == NPC) {
                    images.set(6, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();

            } else if (cells == EIGHTH && images.get(7) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(7, cross);
                } else if (currentPlayer == NPC) {
                    images.set(7, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();

            } else if (cells == NINTH && images.get(8) == blank) {
                if (currentPlayer == PLAYER1) {
                    images.set(8, cross);
                } else if (currentPlayer == NPC) {
                    images.set(8, circle);
                }
                availableCells.remove(cells);
                switchCurrentPlayer();
            }
        }
    }

    private void switchCurrentPlayer() {
        if (currentPlayer == PLAYER1) {
            currentPlayer = NPC;
        } else if (currentPlayer == NPC) {
            currentPlayer = PLAYER1;
        }
    }

    public void isWinning() {
        if (isCross()) {
            gameState = PAUSED;
            winnerGetPoint(PLAYER1);
        } else if (isCircle()) {
            gameState = PAUSED;
            winnerGetPoint(NPC);
        } else if (availableCells.isEmpty()) {
            setWinner("DRAW!");
            gameState = PAUSED;
        }
    }

    public void winnerGetPoint(Player player) {
        switch (player) {
            case PLAYER1:
                scoreP1++;
                setScoringP1(scoreP1 + " Poäng");
                setWinner(getPlayer1() + " Won!");
                break;
            case NPC:
                scoreP2++;
                setScoringP2(scoreP2 + " Poäng");
                setWinner(getPlayer2() + " Won!");
                break;
        }


    }

    public boolean isCross() {
        return checkRows(cross) || checkColumns(cross) || checkDiagonal(cross);
    }

    public boolean isCircle() {
        return checkRows(circle) || checkColumns(circle) || checkDiagonal(circle);
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
