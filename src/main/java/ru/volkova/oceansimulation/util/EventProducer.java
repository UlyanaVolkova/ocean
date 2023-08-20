package ru.volkova.oceansimulation.util;

import ru.volkova.oceansimulation.entity.Shark;

public class EventProducer {

    public void activateEvent(){

    }

    private void sleepEvent(Shark shark){
        int energy = shark.getEnergy();
        energy = energy +20;
        if(energy > 100){
            energy = 100;
        }
        shark.setEnergy(energy);
        System.out.println("Акула вздремнула! + 20 энергии. Текущая энергия " + shark.getEnergy());
    }

    private void swimming(Shark shark){
        int energy = shark.getEnergy();
        energy = energy - 5;
        if(energy<0){
            energy=0;
        }
        shark.setEnergy(energy);
    }
}
