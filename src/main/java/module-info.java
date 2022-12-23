module com.example.snakeandledder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeandledder to javafx.fxml;
    exports com.example.snakeandledder;
}