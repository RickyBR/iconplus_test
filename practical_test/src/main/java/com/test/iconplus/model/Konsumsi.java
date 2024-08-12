package com.test.iconplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Konsumsi {

    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
