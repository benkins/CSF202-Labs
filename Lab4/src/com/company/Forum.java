package com.company;

import java.util.ArrayList;

public class Forum {
    private String name;
    private boolean loginRequired;
    private ArrayList<User> users;
    private ArrayList<Thread> threads;

    public Forum(String name, boolean loginRequired) {
        this.name = name;
        this.loginRequired = loginRequired;
        this.users = users;
    }

    public void registerUser(String username, String password){

    }

    public void removeUser(User userToRemove){

    }

    public void createNew(String title, Post initialPost){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLoginRequired() {
        return loginRequired;
    }

    public void setLoginRequired(boolean loginRequired) {
        this.loginRequired = loginRequired;
    }
}
