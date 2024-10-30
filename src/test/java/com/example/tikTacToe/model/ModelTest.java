package com.example.tikTacToe.model;

import com.example.tikTacToe.Cells;
import javafx.application.Platform;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static com.example.tikTacToe.Cells.*;
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
            model.playerVsNPC();
            model.setCurrentPlayer(Player.PLAYER1);
        }

        @Test
        @DisplayName("firstCellIsStillCircle")
        void firstCellIsStillCircle() {
            model.getImages().set(0,model.circle);
            model.cellClicked(Cells.FIRST);
            assertEquals(model.circle,model.getImages().getFirst());
        }
        @Test
        @DisplayName("secondCellIsStillCircle")
        void secondCellIsStillCircle() {
            model.getImages().set(1,model.circle);
            model.cellClicked(Cells.SECOND);
            assertEquals(model.circle, model.getImages().get(1));
        }
        @Test
        @DisplayName("thirdCellIsStillCircle")
        void thirdCellIsStillCircle() {
            model.getImages().set(2,model.circle);
            model.cellClicked(Cells.THIRD);
            assertEquals(model.circle, model.getImages().get(2));
        }
        @Test
        @DisplayName("fourthCellIsStillCircle")
        void fourthCellIsStillCircle() {
            model.getImages().set(3,model.circle);
            model.cellClicked(Cells.FOURTH);
            assertEquals(model.circle, model.getImages().get(3));
        }
        @Test
        @DisplayName("fifthCellIsStillCircle")
        void fifthCellIsStillCircle() {
            model.getImages().set(4,model.circle);
            model.cellClicked(Cells.FIFTH);
            assertEquals(model.circle, model.getImages().get(4));
        }
        @Test
        @DisplayName("sixthCellIsStillCircle")
        void sixthCellIsStillCircle() {
            model.getImages().set(5,model.circle);
            model.cellClicked(Cells.SIXTH);
            assertEquals(model.circle, model.getImages().get(5));
        }
        @Test
        @DisplayName("seventhCellIsStillCircle")
        void seventhCellIsStillCircle() {
            model.getImages().set(6,model.circle);
            model.cellClicked(Cells.SEVENTH);
            assertEquals(model.circle, model.getImages().get(6));
        }
        @Test
        @DisplayName("eightCellIsStillCircle")
        void eightCellIsStillCircle() {
            model.getImages().set(7,model.circle);
            model.cellClicked(Cells.EIGHTH);
            assertEquals(model.circle, model.getImages().get(7));
        }
        @Test
        @DisplayName("ninthCellIsStillCircle")
        void ninthCellIsStillCircle() {
            model.getImages().set(8,model.circle);
            model.cellClicked(Cells.NINTH);
            assertEquals(model.circle, model.getImages().get(8));
        }
    }

    @Nested
    @DisplayName("circleIsNotValidCellToClick")
    class circleIsNotValidCellToClick {

        @BeforeEach
        void setCurrentPlayerToNPC(){
            model.playerVsNPC();
            model.setCurrentPlayer(Player.NPC);
        }

        @Test
        @DisplayName("firstCellIsStillCross")
        void firstCellIsStillCross() {
            model.getImages().set(0,model.cross);
            model.cellClicked(Cells.FIRST);
            assertEquals(model.cross, model.getImages().getFirst());
        }
        @Test
        @DisplayName("secondCellIsStillCross")
        void secondCellIsStillCross() {
            model.getImages().set(1,model.cross);
            model.cellClicked(Cells.SECOND);
            assertEquals(model.cross, model.getImages().get(1));
        }
        @Test
        @DisplayName("thirdCellIsStillCross")
        void thirdCellIsStillCross() {
            model.getImages().set(2,model.cross);
            model.cellClicked(Cells.THIRD);
            assertEquals(model.cross, model.getImages().get(2));
        }
        @Test
        @DisplayName("fourthCellIsStillCross")
        void fourthCellIsStillCross() {
            model.getImages().set(3,model.cross);
            model.cellClicked(Cells.FOURTH);
            assertEquals(model.cross, model.getImages().get(3));
        }
        @Test
        @DisplayName("fifthCellIsStillCross")
        void fifthCellIsStillCross() {
            model.getImages().set(4,model.cross);
            model.cellClicked(Cells.FIFTH);
            assertEquals(model.cross, model.getImages().get(4));
        }
        @Test
        @DisplayName("sixthCellIsStillCross")
        void sixthCellIsStillCross() {
            model.getImages().set(5,model.cross);
            model.cellClicked(Cells.SIXTH);
            assertEquals(model.cross, model.getImages().get(5));
        }
        @Test
        @DisplayName("seventhCellIsStillCross")
        void seventhCellIsStillCross() {
            model.getImages().set(6,model.cross);
            model.cellClicked(Cells.SEVENTH);
            assertEquals(model.cross, model.getImages().get(6));
        }
        @Test
        @DisplayName("eightCellIsStillCross")
        void eightCellIsStillCross() {
            model.getImages().set(7,model.cross);
            model.cellClicked(Cells.EIGHTH);
            assertEquals(model.cross, model.getImages().get(7));
        }
        @Test
        @DisplayName("ninthCellIsStillCross")
        void ninthCellIsStillCross() {
            model.getImages().set(8,model.cross);
            model.cellClicked(Cells.NINTH);
            assertEquals(model.cross, model.getImages().get(8));
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

            assertEquals("1 Poäng", model.getScoringP1());
        }
        @Test
        @DisplayName("Player1WonBySecondColumn")
        void Player1WonBySecondColumn() {
            model.getImages().set(1,model.cross);
            model.getImages().set(4,model.cross);
            model.getImages().set(7,model.cross);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringP1());
        }
        @Test
        @DisplayName("Player1WonByThirdColumn")
        void Player1WonByThirdColumn() {
            model.getImages().set(2,model.cross);
            model.getImages().set(5,model.cross);
            model.getImages().set(8,model.cross);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringP1());
        }
        @Test
        @DisplayName("Player1WonByFirstRow")
        void Player1WonByFirstRow() {
            model.getImages().set(0,model.cross);
            model.getImages().set(1,model.cross);
            model.getImages().set(2,model.cross);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringP1());
        }
        @Test
        @DisplayName("Player1WonBySecondRow")
        void Player1WonBySecondRow() {
            model.getImages().set(3,model.cross);
            model.getImages().set(4,model.cross);
            model.getImages().set(5,model.cross);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringP1());
        }
        @Test
        @DisplayName("Player1WonByThirdRow")
        void Player1WonByThirdRow() {
            model.getImages().set(6,model.cross);
            model.getImages().set(7,model.cross);
            model.getImages().set(8,model.cross);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringP1());
        }
        @Test
        @DisplayName("Player1WonByFirstDiagonal")
        void Player1WonByFirstDiagonal() {
            model.getImages().set(0, model.cross);
            model.getImages().set(4, model.cross);
            model.getImages().set(8, model.cross);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringP1());
        }
        @Test
        @DisplayName("Player1WonBySecondDiagonal")
        void Player1WonBySecondDiagonal() {
            model.getImages().set(2, model.cross);
            model.getImages().set(4, model.cross);
            model.getImages().set(6, model.cross);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringP1());
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

            assertEquals("1 Poäng", model.getScoringOpponent());
        }

        @Test
        @DisplayName("PlayerNPCWonBySecondColumn")
        void PlayerNPCWonBySecondColumn() {
            model.getImages().set(1,model.circle);
            model.getImages().set(4,model.circle);
            model.getImages().set(7,model.circle);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringOpponent());
        }
        @Test
        @DisplayName("PlayerNPCWonByThirdColumn")
        void PlayerNPCWonByThirdColumn() {
            model.getImages().set(2,model.circle);
            model.getImages().set(5,model.circle);
            model.getImages().set(8,model.circle);
            model.isWinning();

            assertEquals("1 Poäng",model.getScoringOpponent());
        }
        @Test
        @DisplayName("PlayerNPCWonByFirstRow")
        void PlayerNPCWonByFirstRow() {
            model.getImages().set(0,model.circle);
            model.getImages().set(1,model.circle);
            model.getImages().set(2,model.circle);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringOpponent());
        }
        @Test
        @DisplayName("PlayerNPCWonBySecondRow")
        void PlayerNPCWonBySecondRow() {
            model.getImages().set(3,model.circle);
            model.getImages().set(4,model.circle);
            model.getImages().set(5,model.circle);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringOpponent());
        }
        @Test
        @DisplayName("PlayerNPCWonByThirdRow")
        void PlayerNPCWonByThirdRow() {
            model.getImages().set(6,model.circle);
            model.getImages().set(7,model.circle);
            model.getImages().set(8,model.circle);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringOpponent());
        }
        @Test
        @DisplayName("PlayerNPcWonByFirstDiagonal")
        void PlayerNPCWonByFirstDiagonal() {
            model.getImages().set(0, model.circle);
            model.getImages().set(4, model.circle);
            model.getImages().set(8, model.circle);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringOpponent());
        }
        @Test
        @DisplayName("PlayerNPCWonBySecondDiagonal")
        void PlayerNPCWonBySecondDiagonal() {
            model.getImages().set(2, model.circle);
            model.getImages().set(4, model.circle);
            model.getImages().set(6, model.circle);
            model.isWinning();

            assertEquals("1 Poäng", model.getScoringOpponent());
        }

    }

    @Test
    @DisplayName("player1IsAnnouncedAsWinner")
    void player1IsAnnouncedAsWinner() {
        model.playerVsNPC();
        model.getImages().set(0,model.cross);
        model.getImages().set(3,model.cross);
        model.getImages().set(6,model.cross);
        model.isWinning();
        assertEquals("Player1 Won!", model.getWinner() );
    }

    @Test
    @DisplayName("playerNPCIsAnnouncedAsWinner")
    void playerNPCIsAnnouncedAsWinner(){
        model.playerVsNPC();
        model.getImages().set(0,model.circle);
        model.getImages().set(3,model.circle);
        model.getImages().set(6,model.circle);
        model.isWinning();
        assertEquals("NPC Won!", model.getWinner() );
    }

    @Test
    @DisplayName("drawIsAnnounced")
    void drawIsAnnounced(){
        model.playerVsNPC();
        model.availableCells.clear();
        model.isWinning();
        assertEquals("DRAW!", model.getWinner());
    }



}
