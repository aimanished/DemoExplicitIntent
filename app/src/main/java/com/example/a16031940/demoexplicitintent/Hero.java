package com.example.a16031940.demoexplicitintent;

import java.io.Serializable;

public class Hero implements Serializable{

    private String name;
    private int strength;
    private int technicalProwess;

    public Hero(String name, int strength, int technicalProwess) {
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getTechnicalProwess() {
        return technicalProwess;
    }

    public void setTechnicalProwess(int technicalProwess) {
        this.technicalProwess = technicalProwess;
    }
}
