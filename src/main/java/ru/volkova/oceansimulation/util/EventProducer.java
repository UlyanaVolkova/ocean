package ru.volkova.oceansimulation.util;

import ru.volkova.oceansimulation.entity.Shark;

public class EventProducer {

    public void activateEvent(){

    }

    private void sleepEvent(Shark shark){
        int energy = shark.getEnergy();
        int oxygen = shark.getOxygen();
        energy = energy +20;
        if(energy > 100){
            energy = 100;
        }
        oxygen = oxygen - 5;
        if(oxygen < 0){
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setOxygen(oxygen);
        System.out.println("Акула вздремнула! + 20 энергии, - 5 кислорода. Текущая энергия " + shark.getEnergy() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void swimming(Shark shark){
        int energy = shark.getEnergy();
        int oxygen = shark.getOxygen();
        energy = energy - 5;
        if(energy<0){
            energy=0;
        }
        oxygen = oxygen - 5;
        if(oxygen < 0){
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setOxygen(oxygen);
        System.out.println("Акула плавала в океане, но никого не встретила( - 5 энергии и - 5 кислорода. Текущая енергия " + shark.getEnergy() + ". Текущий уровень кислорода " + shark.getOxygen());
    }
}
