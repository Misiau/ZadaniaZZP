package com.company;

import static java.lang.Boolean.TRUE;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("mala", "smietanowa", TRUE).kielbasa(true).pieczarki(true).build();
    }
}
