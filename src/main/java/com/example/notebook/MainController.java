package com.example.notebook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML private TextField search;
    @FXML private ComboBox comboBox;
    @FXML private TableView table;
    @FXML private TableColumn namePrimaryColumn;
    @FXML private TableColumn urlPrimaryColumn;
    @FXML private TableColumn categoryPrimaryColumn;

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


        AppData.resourceItems = FXCollections.observableArrayList(
                new ResourceItem("Wikipedia", "https://www.wikipedia.org/", "Наука"),
                new ResourceItem("Steam", "https://store.steampowered.com/", "Развлечения"),
                new ResourceItem("Ria", "https://ria.ru/", "Новости")
        );
        table.setItems(AppData.resourceItems);
        TableColumn<ResourceItem, String> nameColumn = new TableColumn<ResourceItem, String>("Название");
        TableColumn<ResourceItem, String> urlColumn = new TableColumn<ResourceItem, String>("Ссылка");
        TableColumn<ResourceItem, String> categoryColumn = new TableColumn<ResourceItem, String>("Категория");
        nameColumn.setCellValueFactory(new PropertyValueFactory<ResourceItem, String>("name"));
        urlColumn.setCellValueFactory(new PropertyValueFactory<ResourceItem, String>("url"));
        categoryColumn.setCellValueFactory(new PropertyValueFactory<ResourceItem, String>("category"));
        table.getColumns().set(0, nameColumn);
        table.getColumns().set(1, urlColumn);
        table.getColumns().set(2, categoryColumn);
        nameColumn.setStyle(namePrimaryColumn.getStyle());
        urlColumn.setStyle(urlPrimaryColumn.getStyle());
        categoryColumn.setStyle(categoryPrimaryColumn.getStyle());
    }
}
