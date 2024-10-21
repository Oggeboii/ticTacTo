module com.example.tikTacToe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tikTacToe to javafx.fxml;
    opens com.example.tikTacToe.model to javafx.fxml;
    exports com.example.tikTacToe;
    exports com.example.tikTacToe.controller;
    opens com.example.tikTacToe.controller to javafx.fxml;
    exports com.example.tikTacToe.model;
}
