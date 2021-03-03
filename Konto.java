package com.company;
import java.util.Scanner;

public class Konto{
    double StanKonta = 100;
    Scanner scan = new Scanner(System.in);

    public void Wplata(){
        System.out.print("Kwota do przechowania: ");
        double kwota=scan.nextDouble();
        this.StanKonta+=kwota;
    }
    public void Wyplata(){
        System.out.print("Kwota do wyplacenia: ");
        double kwota = scan.nextDouble();
                this.StanKonta-=kwota;
            }
    public void Stan(){
        System.out.println("Twój stan konta: "+ this.StanKonta);
        if (StanKonta<0){
            System.out.println("Jesteś teraz nam winny pieniadze, znajdziemy cie");
        } } }