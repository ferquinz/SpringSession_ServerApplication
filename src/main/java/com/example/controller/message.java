package com.example.controller;

import java.util.UUID;

public class message {

    private String id = UUID.randomUUID().toString();
    private String content;

    public message(String content) {
        this.content = content;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
