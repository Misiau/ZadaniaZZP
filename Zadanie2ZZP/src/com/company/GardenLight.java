package com.company;

public class GardenLight extends Light {
    private final Light light;
    private int brightness;

    public GardenLight(Light light){
        this.light = light;
    }

    public void dimLight(){
        this.brightness = 50;
    }
}
