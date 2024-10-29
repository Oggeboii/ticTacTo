package com.example.tikTacToe.model;

import com.example.tikTacToe.Cells;
import javafx.application.Platform;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class ModelTest {

    @BeforeAll
    static void runJavaFX() {
        Platform.startup(()->{});
    }

    Model model = new Model();

    @Nested
    @DisplayName("crossIsNotValidCellToClick")
    class crossIsNotValidCellToClick {

        @BeforeEach
        void setCurrentPlayerToPlayer1(){
            model.setCurrentPlayer(Player.PLAYER1);

        }

        @Test
        @DisplayName("firstCellIsStillCircle")
        void firstCellIsStillCircle() {
            model.getImages().set(0,model.circle);
            model.cellClicked(Cells.FIRST);
            assertEquals(model.getImages().getFirst(), model.circle);
        }
        @Test
        @DisplayName("secondCellIsStillCircle")
        void secondCellIsStillCircle() {
            model.getImages().set(1,model.circle);
            model.cellClicked(Cells.SECOND);
            assertEquals(model.getImages().get(1), model.circle);
        }
        @Test
        @DisplayName("thirdCellIsStillCircle")
        void thirdCellIsStillCircle() {
            model.getImages().set(2,model.circle);
            model.cellClicked(Cells.THIRD);
            assertEquals(model.getImages().get(2), model.circle);
        }
        @Test
        @DisplayName("fourthCellIsStillCircle")
        void fourthCellIsStillCircle() {
            model.getImages().set(3,model.circle);
            model.cellClicked(Cells.FOURTH);
            assertEquals(model.getImages().get(3), model.circle);
        }
        @Test
        @DisplayName("fifthCellIsStillCircle")
        void fifthCellIsStillCircle() {
            model.getImages().set(4,model.circle);
            model.cellClicked(Cells.FIFTH);
            assertEquals(model.getImages().get(4), model.circle);
        }
        @Test
        @DisplayName("sixthCellIsStillCircle")
        void sixthCellIsStillCircle() {
            model.getImages().set(5,model.circle);
            model.cellClicked(Cells.SIXTH);
            assertEquals(model.getImages().get(5), model.circle);
        }
        @Test
        @DisplayName("seventhCellIsStillCircle")
        void seventhCellIsStillCircle() {
            model.getImages().set(6,model.circle);
            model.cellClicked(Cells.SEVENTH);
            assertEquals(model.getImages().get(6), model.circle);
        }
        @Test
        @DisplayName("eightCellIsStillCircle")
        void eightCellIsStillCircle() {
            model.getImages().set(7,model.circle);
            model.cellClicked(Cells.EIGHTH);
            assertEquals(model.getImages().get(7), model.circle);
        }
        @Test
        @DisplayName("ninthCellIsStillCircle")
        void ninthCellIsStillCircle() {
            model.getImages().set(8,model.circle);
            model.cellClicked(Cells.NINTH);
            assertEquals(model.getImages().get(8), model.circle);
        }
    }

    @Nested
    @DisplayName("circleIsNotValidCellToClick")
    class circleIsNotValidCellToClick {

        @BeforeEach
        void setCurrentPlayerToNPC(){
            model.setCurrentPlayer(Player.NPC);
        }

        @Test
        @DisplayName("firstCellIsStillCross")
        void firstCellIsStillCross() {
            model.getImages().set(0,model.cross);
            model.cellClicked(Cells.FIRST);
            assertEquals(model.getImages().getFirst(), model.cross);
        }
        @Test
        @DisplayName("secondCellIsStillCross")
        void secondCellIsStillCross() {
            model.getImages().set(1,model.cross);
            model.cellClicked(Cells.SECOND);
            assertEquals(model.getImages().get(1), model.cross);
        }
        @Test
        @DisplayName("thirdCellIsStillCross")
        void thirdCellIsStillCross() {
            model.getImages().set(2,model.cross);
            model.cellClicked(Cells.THIRD);
            assertEquals(model.getImages().get(2), model.cross);
        }
        @Test
        @DisplayName("fourthCellIsStillCross")
        void fourthCellIsStillCross() {
            model.getImages().set(3,model.cross);
            model.cellClicked(Cells.FOURTH);
            assertEquals(model.getImages().get(3), model.cross);
        }
        @Test
        @DisplayName("fifthCellIsStillCross")
        void fifthCellIsStillCross() {
            model.getImages().set(4,model.cross);
            model.cellClicked(Cells.FIFTH);
            assertEquals(model.getImages().get(4), model.cross);
        }
        @Test
        @DisplayName("sixthCellIsStillCross")
        void sixthCellIsStillCross() {
            model.getImages().set(5,model.cross);
            model.cellClicked(Cells.SIXTH);
            assertEquals(model.getImages().get(5), model.cross);
        }
        @Test
        @DisplayName("seventhCellIsStillCross")
        void seventhCellIsStillCross() {
            model.getImages().set(6,model.cross);
            model.cellClicked(Cells.SEVENTH);
            assertEquals(model.getImages().get(6), model.cross);
        }
        @Test
        @DisplayName("eightCellIsStillCross")
        void eightCellIsStillCross() {
            model.getImages().set(7,model.cross);
            model.cellClicked(Cells.EIGHTH);
            assertEquals(model.getImages().get(7), model.cross);
        }
        @Test
        @DisplayName("ninthCellIsStillCross")
        void ninthCellIsStillCross() {
            model.getImages().set(8,model.cross);
            model.cellClicked(Cells.NINTH);
            assertEquals(model.getImages().get(8), model.cross);
        }
    }


    @Nested
    @DisplayName("player1Got1Point")
    class player1Got1Point {

        @Test
        @DisplayName("Player1WonByFirstColumn")
        void Player1WonByFirstColumn() {
            model.getImages().set(0,model.cross);
            model.getImages().set(3,model.cross);
            model.getImages().set(6,model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(),"1 Poäng");
        }
        @Test
        @DisplayName("Player1WonBySecondColumn")
        void Player1WonBySecondColumn() {
            model.getImages().set(1,model.cross);
            model.getImages().set(4,model.cross);
            model.getImages().set(7,model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(),"1 Poäng");
        }
        @Test
        @DisplayName("Player1WonByThirdColumn")
        void Player1WonByThirdColumn() {
            model.getImages().set(2,model.cross);
            model.getImages().set(5,model.cross);
            model.getImages().set(8,model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(),"1 Poäng");
        }
        @Test
        @DisplayName("Player1WonByFirstRow")
        void Player1WonByFirstRow() {
            model.getImages().set(0,model.cross);
            model.getImages().set(1,model.cross);
            model.getImages().set(2,model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(),"1 Poäng");
        }
        @Test
        @DisplayName("Player1WonBySecondRow")
        void Player1WonBySecondRow() {
            model.getImages().set(3,model.cross);
            model.getImages().set(4,model.cross);
            model.getImages().set(5,model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(),"1 Poäng");
        }
        @Test
        @DisplayName("Player1WonByThirdRow")
        void Player1WonByThirdRow() {
            model.getImages().set(6,model.cross);
            model.getImages().set(7,model.cross);
            model.getImages().set(8,model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(),"1 Poäng");
        }
        @Test
        @DisplayName("Player1WonByFirstDiagonal")
        void Player1WonByFirstDiagonal() {
            model.getImages().set(0, model.cross);
            model.getImages().set(4, model.cross);
            model.getImages().set(8, model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(), "1 Poäng");
        }
        @Test
        @DisplayName("Player1WonBySecondDiagonal")
        void Player1WonBySecondDiagonal() {
            model.getImages().set(2, model.cross);
            model.getImages().set(4, model.cross);
            model.getImages().set(6, model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(), "1 Poäng");
        }
    }

    @Nested
    @DisplayName("playerNPCGot1Point")
    class playerNPCGot1Point {

        @Test
        @DisplayName("PlayerNPCWonByFirstColumn")
        void PlayerNPCWonByFirstColumn() {
            model.getImages().set(0,model.circle);
            model.getImages().set(3,model.circle);
            model.getImages().set(6,model.circle);
            model.isWinning();

            assertEquals(model.getScoringOpponent(),"1 Poäng");
        }
        @Test
        @DisplayName("PlayerNPCWonBySecondColumn")
        void PlayerNPCWonBySecondColumn() {
            model.getImages().set(1,model.circle);
            model.getImages().set(4,model.circle);
            model.getImages().set(7,model.circle);
            model.isWinning();

            assertEquals(model.getScoringOpponent(),"1 Poäng");
        }
        @Test
        @DisplayName("PlayerNPCWonByThirdColumn")
        void PlayerNPCWonByThirdColumn() {
            model.getImages().set(2,model.circle);
            model.getImages().set(5,model.circle);
            model.getImages().set(8,model.circle);
            model.isWinning();

            assertEquals(model.getScoringOpponent(),"1 Poäng");
        }
        @Test
        @DisplayName("PlayerNPCWonByFirstRow")
        void PlayerNPCWonByFirstRow() {
            model.getImages().set(0,model.circle);
            model.getImages().set(1,model.circle);
            model.getImages().set(2,model.circle);
            model.isWinning();

            assertEquals(model.getScoringOpponent(),"1 Poäng");
        }
        @Test
        @DisplayName("PlayerNPCWonBySecondRow")
        void PlayerNPCWonBySecondRow() {
            model.getImages().set(3,model.circle);
            model.getImages().set(4,model.circle);
            model.getImages().set(5,model.circle);
            model.isWinning();

            assertEquals(model.getScoringOpponent(),"1 Poäng");
        }
        @Test
        @DisplayName("PlayerNPCWonByThirdRow")
        void PlayerNPCWonByThirdRow() {
            model.getImages().set(6,model.circle);
            model.getImages().set(7,model.circle);
            model.getImages().set(8,model.circle);
            model.isWinning();

            assertEquals(model.getScoringOpponent(),"1 Poäng");
        }
        @Test
        @DisplayName("PlayerNPcWonByFirstDiagonal")
        void PlayerNPCWonByFirstDiagonal() {
            model.getImages().set(0, model.cross);
            model.getImages().set(4, model.cross);
            model.getImages().set(8, model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(), "1 Poäng");
        }
        @Test
        @DisplayName("PlayerNPcWonBySecondDiagonal")
        void PlayerNPCWonBySecondDiagonal() {
            model.getImages().set(2, model.cross);
            model.getImages().set(4, model.cross);
            model.getImages().set(6, model.cross);
            model.isWinning();

            assertEquals(model.getScoringP1(), "1 Poäng");
        }

    }
}
