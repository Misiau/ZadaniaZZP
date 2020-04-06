package com.company;
import java.util.LinkedList;
import java.util.List;

public class Kuchnia implements Observer {

    LinkedList<LinkedList<String>> orders = new LinkedList<>();

    @Override
    public void update(LinkedList<String> zamowienie) {
        orders.add(zamowienie);
    }
}
