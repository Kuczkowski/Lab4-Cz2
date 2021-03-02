package com.company;

public class Wiatrak {
    int speed, radius;
    String on,color;

    public Wiatrak(int speed, String wlacz, int szerokosc, String kolor){
        this.speed=speed;
        this.on=wlacz;
        this.radius=szerokosc;
        this.color=kolor;
    }

    Wiatrak(){
        this.speed = Szybkosc.Slow.obroty;
        this.on = "jest wyłączony";
        this.radius = 10;
        this.color = "Fioletowy";
    }

    public void informacje(){
        System.out.println("Szybkosc obrotow: "+this.speed+"\nStan: "+this.on+"\nPromien: "+this.radius+"\nKolor: "+this.color);
    } }