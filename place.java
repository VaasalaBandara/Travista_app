package com.example.btnrecyclerveiw;
//for card data
public class place {
    private String title;
    private int thumbnail;
    private int Id;
//getters and setters for decription
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //new1
    private String description;
    //images require int reference

    //constructors


    public place(String title, int thumbnail, int id, String description) {
        this.title = title;
        this.thumbnail = thumbnail;
        Id = id;
        this.description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;//unique to all books
    }


//methods for variBLES
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}

