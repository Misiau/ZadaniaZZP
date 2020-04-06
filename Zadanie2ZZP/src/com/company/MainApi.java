package com.company;

public class MainApi {
    private Doors mainDoors = new Doors();
    private Light hallWayLight = new Light();
    private Heating salloonHeating = new Heating();

    public void LockHome(){
        System.out.println("HOME LOCKED");
        mainDoors.Lock();
        hallWayLight.turnOff();
        salloonHeating.turnOff();
    }

    public void UnlockHome(){
        System.out.println("HOME UNLOCKED");
        mainDoors.Unlock();
        hallWayLight.turnOn();
        salloonHeating.turnOn();
    }

    public void lightOn(){

        System.out.println("LIGHT ON");
        hallWayLight.turnOn();
    }

    public void lightOff(){
        System.out.println("LIGHT OFF");
    }

    public void turnHeating(int temperature){
        salloonHeating.turnOn();
        salloonHeating.setTemperature(temperature);
    }
}
