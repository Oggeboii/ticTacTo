package com.example.tikTacToe.model;

import com.example.tikTacToe.Cells;
import com.example.tikTacToe.model.Model;
import javafx.application.Platform;
import org.assertj.core.data.Index;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatList;
import static org.junit.jupiter.api.Assertions.*;
class ModelTest {

    @BeforeAll
    static void runJavaFX() {
        Platform.startup(()->{});
    }

    Model model = new Model();

    @Test
    void whenCreatingModelThenGameStateIsPaused(){
        assertEquals(GameState.PAUSED, model.getGameState() , "Initial game state should be paused");

    }

    @Nested
    @DisplayName("allCellsAreBlankWhenNewGame")
    class allCellsAreBlankWhenNewGame {

        @BeforeEach
        void playerVsNPC(){
            model.playerVsNPC();
        }

        @Test
        @DisplayName("firstCellIsBlank")
        void firstCellIsBlank() {
            assertEquals(model.getImages().getFirst(), model.blank);
        }
        @Test
        @DisplayName("secondCellIsBlank")
        void secondCellIsBlank() {
            assertEquals(model.getImages().get(1), model.blank);
        }
        @Test
        @DisplayName("thirdCellIsBlank")
        void thirdCellIsBlank() {
            assertEquals(model.getImages().get(2), model.blank);
        }
        @Test
        @DisplayName("fourthCellIsBlank")
        void fourthCellIsBlank() {
            assertEquals(model.getImages().get(3), model.blank);
        }
        @Test
        @DisplayName("fifthCellIsBlank")
        void fifthCellIsBlank() {
            assertEquals(model.getImages().get(4), model.blank);
        }
        @Test
        @DisplayName("sixthCellIsBlank")
        void sixthCellIsBlank() {
            assertEquals(model.getImages().get(5), model.blank);
        }
        @Test
        @DisplayName("seventhCellIsBlank")
        void seventhCellIsBlank() {
            assertEquals(model.getImages().get(6), model.blank);
        }
        @Test
        @DisplayName("eighthCellIsBlank")
        void eighthCellIsBlank() {
            assertEquals(model.getImages().get(7), model.blank);
        }
        @Test
        @DisplayName("ninthCellIsBlank")
        void ninthCellIsBlank() {
            assertEquals(model.getImages().get(8), model.blank);
        }




    }








  
}
