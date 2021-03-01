package com.company;
import java.util.Scanner;


public class Remote_zad5{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Jesli chcesz wlaczyc telewizor to daj liczbe wyzsza od 1, jesli nie to 0 które nic nie właczy.");
        int odpowiedz = scan.nextInt();
        while (odpowiedz>1)
        {
        TV_zad5 opcja = new TV_zad5();
        opcja.wlaczyc = odpowiedz;
        System.out.println("Twoj wybor to tak, nacisnales liczbę: "+odpowiedz);




        System.out.println("Podaj kanał:");
        int numer = scan.nextInt();
        while (numer>20){
            System.out.println("Najwiekszy kanał to 20, zostanie na to ustawione.");
            numer =20;}
        while (numer<1){
            System.out.println("Najmniejsza mozliwa opcja to 1, zostanie na to ustawione.");
            numer=1;
        }
        TV_zad5 kanal = new TV_zad5();
        kanal.channel = numer;
        System.out.println("Kanal ustawiono na: "+numer);


        System.out.println("Podaj głośność:");
        int glosnosc =scan.nextInt();
        while (glosnosc>10){
            System.out.println("Najwieksza glosnosc mozliwa to 10, zostanie na to ustawione.");
            glosnosc =10;}
        while (glosnosc<1){
            System.out.println("Najmniejsza mozliwa opcja to 1, zostanie na to ustawione.");
            glosnosc=1;
        }
        TV_zad5 glos = new TV_zad5();
        glos.volume =glosnosc;
        System.out.println("Głośność ustawiono na: "+glosnosc);
        return;
    } } }
