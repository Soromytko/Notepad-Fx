package com.example.notebook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateResourceController {
    @FXML
    private void onAddCategory() {
        Parent root;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource("add_category.fxml"));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onAddResource() {
	    System.out.println("on Click");
    }

}
