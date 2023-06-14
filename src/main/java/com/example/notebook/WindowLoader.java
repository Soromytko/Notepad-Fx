package com.example.notebook;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowLoader {
    public static Stage load(String fxmlPath) {
        Parent root;
        try {
            root = FXMLLoader.load(HelloApplication.class.getResource(fxmlPath));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root));
            stage.show();
            return stage;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
