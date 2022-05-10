package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
        double boy = input.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        double kilo = input.nextDouble();
        double vucutKitle = kilo / Math.pow(boy,2);
        System.out.println("\n Vucut Kitle İndeksi: " + vucutKitle);

    }
}
