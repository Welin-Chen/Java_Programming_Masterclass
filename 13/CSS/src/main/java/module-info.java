module com.example.css {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    requires javafx.web;

    opens com.example.css to javafx.fxml;
    exports com.example.css;
}