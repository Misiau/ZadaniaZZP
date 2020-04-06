package com.company;

public class Main {

    public static void main(String[] args) {
        MainApi mainApi = new MainApi();
        mainApi.LockHome();
        mainApi.UnlockHome();
        mainApi.turnHeating(22);
        mainApi.lightOff();

        Light light = new Light();
        GarageLight gar = new GarageLight(light);
        CinemaLight cin = new CinemaLight(light);
        GardenLight gardenLight = new GardenLight(light);
        gardenLight.dimLight();

        gar.turnOn();
        cin.setDynamicLight(true);
    }
}
