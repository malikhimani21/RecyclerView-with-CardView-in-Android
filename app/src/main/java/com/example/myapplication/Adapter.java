package com.example.myapplication;

public class Adapter {

    private String title;
    private String category;
    private String description;
    private int img;

    public Adapter() {
    }

    public Adapter(String title, String category, String description, int img) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
