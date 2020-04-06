package com.company;

import java.util.LinkedList;

public class Kiosk{
    private LinkedList<Kuchnia> kuchnie = new LinkedList<>();
    public void addObserver(Kuchnia kuchnia) {
        this.kuchnie.add(kuchnia);
    }

    public void removeObserver(Kuchnia kuchnia) {
        this.kuchnie.remove(kuchnia);
    }

    public void newOrder(LinkedList<String> zamowienie) {
        for (Kuchnia kuchnia : this.kuchnie) {
            kuchnia.update(zamowienie);
        }
    }

    public void placeOrder(String produkt)
    {
        System.out.println("Kiosk: Wyslij do kuchni");
    }
}
