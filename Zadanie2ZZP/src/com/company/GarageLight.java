package com.company;

public class GarageLight extends Light {
    private Light light;

    public GarageLight(Light light){
        this.light = light;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
