package com.company;

import java.util.ArrayList;

public class Thread {
    private String title;
    private ArrayList<Post> posts;

    public Thread(String title, ArrayList<Post> posts) {
        this.title = title;
        this.posts = posts;
    }

    public void changeCategory(Category category){

    }

    public void addPost(Post post){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
}
