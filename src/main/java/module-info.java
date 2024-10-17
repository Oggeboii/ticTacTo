module com.example.tiktacto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tiktacto to javafx.fxml;
    exports com.example.tiktacto;
}