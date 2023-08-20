package ru.volkova.oceansimulation.entity;

public class Shark {

    private int health =100;
    private int energy = 100;
    private int oxygen = 100;
    private double mouth = 3.3;


    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public int getEnergy(){
        return this.energy;
    }

    public void setOxygen(int oxygen){
        this.oxygen = oxygen;
    }

    public int getOxygen(){
        return this.oxygen;
    }

    public double getMouth() {
        return this.mouth;
    }
}
