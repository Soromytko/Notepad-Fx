package com.example.notebook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;

import java.io.IOException;
import java.util.ResourceBundle;

public class CreateResourceController implements Initializable {
    @FXML private TextField resourceName;
    @FXML private TextField resourceUrl;
    @FXML private ComboBox comboBox;

    public CreateResourceController() {

    }

    @Override public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
        comboBox.setItems(langs);
        comboBox.setValue("Java");
    }

    @FXML private void onAddCategory(ActionEvent event) {
        Stage stage = WindowLoader.load("add_category.fxml");
    }

    @FXML private void onAddResource(ActionEvent event) {

        System.out.println(resourceName.getText());
        System.out.println(resourceUrl.getText());



        return;

//	    System.out.println("on Click");
//
//        Stage thisStage = (Stage) WindowLoader.getScene(event).getWindow();
//        thisStage.close();
    }
}
