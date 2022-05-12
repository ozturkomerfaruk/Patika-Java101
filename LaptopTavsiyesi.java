package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Paranıza göre Laptop tavsiyesi veren program*/
        System.out.print("Para Miktariniz: ");
        int paraMiktari = input.nextInt();
        if(paraMiktari < 5000)
            System.out.println("Laptop Alamazsınız");
        else if (paraMiktari > 5000 && paraMiktari < 10000)
            System.out.println("Monster Bilgisayarlarina Bakabilirsin");
        else if (paraMiktari > 10000 && paraMiktari < 20000)
            System.out.println("Dell bilgisayarlarina bakabilirsin");
        else {
            System.out.println("Apple bilgisayarlarina bakabilirsin");
        }
        //Degerler ve sonuclar sallamasyondur!
    }
}
