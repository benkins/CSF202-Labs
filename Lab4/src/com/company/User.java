package com.company;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String username;
    private Date birthday;
    private String location;
    private String occupation;
    private String password;
    private ArrayList<Category> categories;
    private ArrayList<Post> posts;

    public User(String username, Date birthday, String location, String occupation, String password) {
        this.username = username;
        this.birthday = birthday;
        this.location = location;
        this.occupation = occupation;
        this.password = password;
    }

    public String getDetails(){
        return "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
}
