package com.company;

import java.util.ArrayList;

public class Category {
    private String name;
    private boolean isRestricted;
    private ArrayList<User> users;
    private  ArrayList<Thread> threads;

    public Category(String name, boolean isRestricted) {
        this.name = name;
        this.isRestricted = isRestricted;
    }

    public void addUser(User user){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRestricted() {
        return isRestricted;
    }

    public void setRestricted(boolean restricted) {
        isRestricted = restricted;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Thread> getThreads() {
        return threads;
    }

    public void setThreads(ArrayList<Thread> threads) {
        this.threads = threads;
    }
}
