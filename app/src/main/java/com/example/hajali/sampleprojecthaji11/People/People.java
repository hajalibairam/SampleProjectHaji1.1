package com.example.hajali.sampleprojecthaji11.People;

/**
 * Created by hajali on 12/21/16.
 */

public class People {

    private String name;
    private String type;

    public People(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public People() {
    }

    public String getNName() {
        return name;
    }

    public void setNName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
