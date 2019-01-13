package com.codingblocks.lecture_11;

public class WonderCar extends Car {

    public int engines = 2;

    public Engine engine;

    public WonderCar(){
        engine = new PetrolEngine();
    }

    @Override
    public void start(){
        System.out.println("Start with extra noise");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Stoping like the wonder car");
        engine.stop();
    }

    @Override
    public void locking() {
        System.out.println("We are using wonder lock");
    }

    public void changeEngine(){
        engine = new PetrolEngine();
    }

    public void fly(){
        System.out.println("Udta firu");
    }
}
