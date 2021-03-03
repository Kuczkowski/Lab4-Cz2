package com.company;
import java.util.Scanner;

public class Bankomat {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        Konto Klient[] = new Konto[10];
        for(int i=0; i<Klient.length;i++) {
            Klient[i] = new Konto();
        }

            System.out.println("Twoje ID: ");
            int ID = scan.nextInt();
            int opcja = 0;
            while (opcja != 4) {
                System.out.println("1:Stan konta\n2:Wypłac pieniadze\n3:Przechowaj pieniadze\n4:Wyjscie");
                opcja = scan.nextInt();

                switch (opcja) {
                    case 1:
                        Klient[ID].Stan();
                        break;
                    case 2:
                        Klient[ID].Wyplata();
                        break;
                    case 3:
                        Klient[ID].Wplata();
                        break;
                    case 4:
                        System.out.println("Zegnaj");
                }
            while (opcja >=5){
            System.out.println("Podaj prawidlowa opcje.");
            break;
            } } } }