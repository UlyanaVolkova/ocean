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

    private void swimmingEvent(Shark shark){
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

    private void eatCrab(Shark shark){
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 5;
        if(energy<0){
            energy=0;
        }
        health = health + (int)(shark.getMouth()*3);
        if(health>100){
            health=100;
        }
        oxygen = oxygen - 5;
        if(oxygen < 0){
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        System.out.println("У акулы легкий перекус крабом. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }
    private void eatTrout(Shark shark){
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 7;
        if(energy<0){
            energy=0;
        }
        health = health + (int)(shark.getMouth()*6);
        if(health>100){
            health=100;
        }
        oxygen = oxygen - 6;
        if(oxygen < 0){
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        System.out.println("Охота удалась! Акула съела форель. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void eatSeal(Shark shark){
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 10;
        if(energy<0){
            energy=0;
        }
        health = health + (int)(shark.getMouth()*10);
        if(health>100){
            health=100;
        }
        oxygen = oxygen - 7;
        if(oxygen < 0){
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        System.out.println("Ого! Вот это улов! Акула съела тюленя. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private  void fishermanAttack(Shark shark){
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 15;
        if(energy<0){
            energy=0;
        }
        health = health - 20;
        if(health < 0){
            health=0;
        }
        oxygen = oxygen - 10;
        if(oxygen < 0){
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        System.out.println("Рыбаки пытались поймать акулу. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void surfacedEvent(Shark shark){
        int energy = shark.getEnergy();
        int oxygen = shark.getOxygen();
        energy = energy - 10;
        if(energy<0){
            energy=0;
        }
        oxygen = oxygen + 30;
        if(oxygen > 100){
            oxygen = 100;
        }
        shark.setEnergy(energy);
        shark.setOxygen(oxygen);
        System.out.println("Акула всплыла на поверхность вдохнуть кислород. Текущая енергия " + shark.getEnergy() + ". Текущий уровень кислорода " + shark.getOxygen());
    }
}
