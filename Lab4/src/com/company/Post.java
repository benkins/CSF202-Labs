package com.company;

public class Post {
    private String text;
    public String quote(){
        return "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if(this.text.length() >0 ){
            this.text = text;
        }
    }
}
