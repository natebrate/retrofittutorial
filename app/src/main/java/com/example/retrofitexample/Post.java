package com.example.retrofitexample;

import com.google.gson.annotations.SerializedName;
public class Post {
    private final int userId;
    private Integer id;
    private final String title;
    @SerializedName("body")
    private final String text;
    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }
    public int getUserId() {
        return userId;
    }
    //use of Integer instead of int because Integer is nullable
    public Integer getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }
}