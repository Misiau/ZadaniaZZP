package com.company;

public class Heating {
    public boolean state;
    public int temperature;

    public void turnOn(){
        this.state = true;
    }

    public void turnOff(){
        this.state = false;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
