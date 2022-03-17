module com.example.events {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.events to javafx.fxml;
    exports com.example.events;
}