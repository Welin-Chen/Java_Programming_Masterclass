module academy.learnprogramming.ui {
    requires javafx.controls;
    requires javafx.fxml;
    requires academy.learnprogramming.db;

    exports academy.learnprogramming.ui to javafx.graphics,javafx.fxml;
    opens academy.learnprogramming.ui;
}