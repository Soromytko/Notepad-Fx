package com.example.notebook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML private TextField search;
    @FXML private ComboBox comboBox;

    @FXML private void onSearch(ActionEvent event) {
        System.out.println(search.getText());
    }

    @FXML
    private void onAddResource (ActionEvent event) {
        WindowLoader.load("create_resource.fxml");

//        ((Node)(event.getSource())).getScene().getWindow().hide();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> categories = FXCollections.observableArrayList(AppData.categories);
        categories.add(0, "Все");

        comboBox.setItems(categories);
        comboBox.setValue(categories.get(0));
    }
}
