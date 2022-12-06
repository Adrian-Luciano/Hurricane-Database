package com.HurricaneDatabase.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Metrics {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int cycID;
    private int date;
    private int wind;
    private int lat;
    private int lon;
    private String classi;

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
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }
    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }
    public int getLon() {
        return lon;
    }

    public void setLong(int lon) {
        this.lon = lon;
    }

    public void setClassi(String classi) {
        this.classi = classi;
    }
    public String getClassi() {
        return classi;
    }
}
