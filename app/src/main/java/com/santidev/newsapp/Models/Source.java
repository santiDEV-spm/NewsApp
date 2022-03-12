package com.santidev.newsapp.Models;

import java.io.Serializable;

public class Source implements Serializable {

    private String id = "";
    private String name = "";

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
