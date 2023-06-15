package com.example.notebook;

import javafx.beans.property.SimpleStringProperty;

public class ResourceItem {
    private SimpleStringProperty name;
    private SimpleStringProperty url;
    private SimpleStringProperty category;

    public ResourceItem(String name, String url, String category) {
        this.name = new SimpleStringProperty(name);
        this.url = new SimpleStringProperty(url);
        this.category = new SimpleStringProperty(category);
    }

    public String getName() { return this.name.get(); }
    public void setName(String name) { this.name.set(name); }
    public String getUrl() {return this.url.get(); }
    public void setUrl(String url) { this.url.set(url); }
    public String getCategory() {return this.category.get(); }
    public void setCategory(String category) { this.category.set(category); }
}
