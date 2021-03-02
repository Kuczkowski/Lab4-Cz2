package com.company;

public enum Szybkosc {
    Slow(1), Medium(2), Fast(3);

    public int obroty;
    Szybkosc(int predkosc) {
        this.obroty = predkosc;
    } }