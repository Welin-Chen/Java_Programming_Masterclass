module com.example.layout {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.layout to javafx.fxml;
    exports com.example.layout;
}