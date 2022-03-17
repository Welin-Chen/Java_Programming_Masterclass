module com.example.secenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.secenebuilder to javafx.fxml;
    exports com.example.secenebuilder;
}