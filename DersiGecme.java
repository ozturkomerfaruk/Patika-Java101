package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Matematik, Fizik, Türkçe, Kimya, Müzik
        System.out.print("Matematik notunuz: ");
        double mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        double fiz = input.nextInt();
        System.out.print("Turkce notunuz: ");
        double tur = input.nextInt();
        System.out.print("Kimya notunuz: ");
        double kim = input.nextInt();
        System.out.print("Muzik notunuz: ");
        double muzik = input.nextInt();

        if (mat < 0 || mat > 100) mat = 0;
        if (fiz < 0 || fiz > 100) fiz = 0;
        if (tur < 0 || tur > 100) tur = 0;
        if (kim < 0 || kim > 100) kim = 0;
        if (muzik < 0 || muzik > 100) muzik = 0;

        double avg = (mat + fiz + tur + kim + muzik) / 5;
        String str = avg > 55 ? "Gectin" : "Kaldin";
        System.out.println(avg + " ortalamayla: " + str);
    }
}
