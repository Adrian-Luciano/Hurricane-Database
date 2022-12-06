package com.HurricaneDatabase.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int cycID;
    private String name;

    public Classification(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getCycID() {
        return cycID;
    }

    public void setCycID(int id) {
        this.cycID = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
