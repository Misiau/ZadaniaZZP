package com.company;

public class CinemaLight extends Light {
    private String color;
    private boolean dynamicLight;
    private Light light;

    public CinemaLight(Light light){
        this.light = light;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDynamicLight(boolean dynamic){
        this.dynamicLight = dynamic;
    }
}
