package com.example.notebook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateCategoryController implements Initializable {

    @FXML
    private Button buttonConfirm;
    @FXML
    private Button buttonCancel;
    @FXML private TextField textField;
    @FXML private Label label;

    @FXML
    private void onConfirm(ActionEvent event) {
        String maybeCategory = textField.getText();
        System.out.println(maybeCategory);

        if (maybeCategory.isEmpty()) {
            label.setText("Название категории не должно быть пустым");
            return;
        }
        if (AppData.categories.contains(maybeCategory)) {
            label.setText("Такая категория уже существует");
            return;
        }

        AppData.categories.add(maybeCategory);
        WindowLoader.getStage(event).close();
    }

    @FXML private void onCancel(ActionEvent event) {
        WindowLoader.getStage(event).close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        label.setText("");
    }
}
