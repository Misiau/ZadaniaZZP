package com.company;

import java.util.LinkedList;

public class Order implements Command {

    LinkedList<String> listaProduktow = new LinkedList<String>();
    private String produkt;

    public Order(String produkt) {
        this.produkt = produkt;
    }

    @Override
    public void dodaj(String product) {

    }
}
