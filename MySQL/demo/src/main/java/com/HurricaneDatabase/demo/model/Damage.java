package com.HurricaneDatabase.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Damage {
    public Damage(){};
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id; //cyclone ID
    private int cost;
    private int death;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getDeath() {
        return death;
    }



}
