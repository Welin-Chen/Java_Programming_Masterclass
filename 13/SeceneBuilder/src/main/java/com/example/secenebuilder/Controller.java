package com.example.secenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label label;

    @FXML
    public void handleAction(){
        label.setText("OK buttion pressed");
    }


}