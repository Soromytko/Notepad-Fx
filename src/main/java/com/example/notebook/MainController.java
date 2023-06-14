package com.example.notebook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;

public class MainController {

    @FXML
    private void onAddResource (ActionEvent event) {
        WindowLoader.load("create_resource.fxml");

//        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    
}
