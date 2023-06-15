package com.example.notebook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AppData {
    public static ObservableList<ResourceItem> resourceItems = FXCollections.observableArrayList();
    public static ObservableList<String> categories = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
}
