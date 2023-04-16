module com.example.snakeladderap {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.snakeladderap to javafx.fxml;
    exports com.example.snakeladderap;
    exports com.example;
    opens com.example to javafx.fxml;
}