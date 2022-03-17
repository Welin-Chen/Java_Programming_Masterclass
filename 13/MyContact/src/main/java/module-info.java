module com.example.mycontact {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.mycontact.datamodel;
    opens com.example.mycontact to javafx.fxml;
    exports com.example.mycontact;
}