package com.module.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private long id;
    private String agge;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAgge() {
        return agge;
    }

    public void setAgge(String agge) {
        this.agge = agge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}