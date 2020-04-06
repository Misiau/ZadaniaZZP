package com.company;

public class Pizza {
    private final String rozmiar;
    private final String baza;
    private final boolean calzone;

    private final boolean szynka;
    private final boolean pieczarki;
    private final boolean cebula;
    private final boolean papryka;
    private final boolean kielbasa;
    private final boolean ser;


    public static class Builder {

        private final String rozmiar;
        private final String baza;
        private final boolean calzone;

        private boolean szynka;
        private boolean pieczarki;
        private boolean cebula;
        private boolean papryka;
        private boolean kielbasa;
        private boolean ser;

        public Builder(String rozmiar, String baza, boolean calzone) {
            this.rozmiar = rozmiar;
            this.calzone = calzone;
            this.baza = baza;
        }

        public Builder szynka(boolean szynka) {
            this.szynka = szynka;
            return this;
        }

        public Builder pieczarki(boolean pieczarki) {
            this.pieczarki = pieczarki;
            return this;
        }

        public Builder cebula(boolean cebula) {
            this.cebula = cebula;
            return this;
        }

        public Builder papryka(boolean papryka) {
            this.papryka = papryka;
            return this;
        }

        public Builder kielbasa(boolean kielbasa) {
            this.kielbasa = kielbasa;
            return this;
        }

        public Builder ser(boolean ser) {
            this.ser = ser;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.rozmiar = builder.rozmiar;
        this.baza = builder.baza;
        this.calzone = builder.calzone;
        this.szynka = builder.szynka;
        this.pieczarki = builder.pieczarki;
        this.cebula = builder.cebula;
        this.papryka = builder.papryka;
        this.kielbasa = builder.kielbasa;
        this.ser = builder.ser;
    }
}
