package ru.volkova.oceansimulation.util;

import ru.volkova.oceansimulation.entity.Shark;

public class EventProducer {

    public void startSimulation(Shark shark) {
        Math.random();
        while (checkStatus(shark)){
            int randomNumber = (int)(Math.random() * 100);
            if(randomNumber>=0 && randomNumber < 10){
                sleepEvent(shark);
            } else if(randomNumber>=10 && randomNumber < 20){
                swimmingEvent(shark);
            }else if(randomNumber>=20 && randomNumber < 30){
                eatCrab(shark);
            }else if (randomNumber>=30 && randomNumber < 40){
                eatTrout(shark);
            }else if (randomNumber>=40 && randomNumber < 50){
                eatSalmon(shark);
            }else if (randomNumber>=50 && randomNumber < 60){
                eatSeal(shark);
            }else if (randomNumber>=60 && randomNumber < 70){
                fishermanAttack(shark);
            }else if (randomNumber>=70 && randomNumber < 80){
                surfacedEvent(shark);
            }else if (randomNumber>=80 && randomNumber < 90){
                fightForTerritory(shark);
            }else if (randomNumber>=90 && randomNumber < 100){
                photoEvent(shark);
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println("Oooo нет! Акула умерла(( Конец!");

    }

    private void sleepEvent(Shark shark) {
        int energy = shark.getEnergy();
        int oxygen = shark.getOxygen();
        energy = energy + 20;
        if (energy > 100) {
            energy = 100;
        }
        oxygen = oxygen - 5;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Акула вздремнула! + 20 энергии, - 5 кислорода. Текущая энергия " + shark.getEnergy() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void swimmingEvent(Shark shark) {
        int energy = shark.getEnergy();
        int oxygen = shark.getOxygen();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        oxygen = oxygen - 5;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Акула плавала в океане, но никого не встретила( - 5 энергии и - 5 кислорода. Текущая енергия " + shark.getEnergy() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void eatCrab(Shark shark) {
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (shark.getMouth() * 3);
        if (health > 100) {
            health = 100;
        }
        oxygen = oxygen - 5;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("У акулы легкий перекус крабом. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void eatTrout(Shark shark) {
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 7;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (shark.getMouth() * 6);
        if (health > 100) {
            health = 100;
        }
        oxygen = oxygen - 6;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Охота удалась! Акула съела форель. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void eatSalmon(Shark shark) {
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 8;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (shark.getMouth() * 7);
        if (health > 100) {
            health = 100;
        }
        oxygen = oxygen - 6;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Ммммм, неплохо! Акула съела лосось. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void eatSeal(Shark shark) {
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 10;
        if (energy < 0) {
            energy = 0;
        }
        health = health + (int) (shark.getMouth() * 10);
        if (health > 100) {
            health = 100;
        }
        oxygen = oxygen - 7;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Ого! Вот это улов! Акула съела тюленя. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void fishermanAttack(Shark shark) {
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 15;
        if (energy < 0) {
            energy = 0;
        }
        health = health - 20;
        if (health < 0) {
            health = 0;
        }
        oxygen = oxygen - 10;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Рыбаки пытались поймать акулу. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void surfacedEvent(Shark shark) {
        int energy = shark.getEnergy();
        int oxygen = shark.getOxygen();
        energy = energy - 10;
        if (energy < 0) {
            energy = 0;
        }
        oxygen = oxygen + 30;
        if (oxygen > 100) {
            oxygen = 100;
        }
        shark.setEnergy(energy);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Акула всплыла на поверхность вдохнуть кислород. Текущая енергия " + shark.getEnergy() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void fightForTerritory(Shark shark) {
        int energy = shark.getEnergy();
        int health = shark.getHealth();
        int oxygen = shark.getOxygen();
        energy = energy - 10;
        if (energy < 0) {
            energy = 0;
        }
        health = health - 12;
        if (health < 0) {
            health = 0;
        }
        oxygen = oxygen - 7;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setHealth(health);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Борьба с другой акулой за территорию. Текущая енергия " + shark.getEnergy() + ". Текущее здоровье " + shark.getHealth() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private void photoEvent(Shark shark){
        int energy = shark.getEnergy();
        int oxygen = shark.getOxygen();
        energy = energy - 10;
        if (energy < 0) {
            energy = 0;
        }
        oxygen = oxygen - 5;
        if (oxygen < 0) {
            oxygen = 0;
        }
        shark.setEnergy(energy);
        shark.setOxygen(oxygen);
        checkEnergy(shark);
        checkOxygen(shark);
        System.out.println("Акула приплыла к берегу и хотела фото с туристом, но все сбежали(.Текущая енергия " + shark.getEnergy() + ". Текущий уровень кислорода " + shark.getOxygen());
    }

    private boolean checkStatus(Shark shark) {
        if (shark.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void checkEnergy(Shark shark){
        if (shark.getEnergy()<= 0){
            int health = shark.getHealth();
            health = health - 5;
            if (health<0){
                health=0;
            }
            shark.setHealth(health);
        }
    }

    private void checkOxygen(Shark shark){
        if (shark.getOxygen()<= 0){
            int health = shark.getHealth();
            health = health - 5;
            if (health<0){
                health=0;
            }
            shark.setHealth(health);
        }
    }
}