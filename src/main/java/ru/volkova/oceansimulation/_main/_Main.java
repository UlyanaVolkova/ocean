package ru.volkova.oceansimulation._main;

import ru.volkova.oceansimulation.entity.Shark;
import ru.volkova.oceansimulation.util.EventProducer;

public class _Main {

    public static void main(String[] args){
        Shark shark = new Shark();
        EventProducer eventProducer = new EventProducer();
        eventProducer.startSimulation(shark);

    }
}
