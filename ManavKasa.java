package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutKG = 2.14, elmaKG = 3.67, domatesKG = 1.11, muzKG = 0.95, patlicanKG = 5;
        double armut, elma, domates, muz, patlican, total;
        System.out.print("Armut Kac Kilo? :"); armut = input.nextDouble();
        System.out.print("Elma Kac Kilo? :"); elma = input.nextDouble();
        System.out.print("Domates Kac Kilo? :"); domates = input.nextDouble();
        System.out.print("Muz Kac Kilo? :"); muz = input.nextDouble();
        System.out.print("Patlican Kac Kilo? :"); patlican = input.nextDouble();

        total = armut*armutKG + elma*elmaKG + domates*domatesKG + muz*muzKG + patlican*patlicanKG;
        System.out.println("Toplam fiyat: " + total + " TL");
    }
}
