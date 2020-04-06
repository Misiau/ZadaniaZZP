package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Kuchnia kuchnia = new Kuchnia();

        Kiosk kiosk = new Kiosk();

        LinkedList<String> zamowienie = new LinkedList<>();
        zamowienie.add("kanapka");
        zamowienie.add("cola");
        zamowienie.add("cola");

        kiosk.addObserver(kuchnia);
        kiosk.newOrder(zamowienie);
    }
}
