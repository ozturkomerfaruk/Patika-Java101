package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, pi = 3.14;
        System.out.print("Yaricap: ");
        r = input.nextDouble();
        double alan, cevre;
        alan = pi * Math.pow(r,2);
        cevre = 2*pi*r;
        System.out.printf("\nAlan: " + alan + "\nCevre: "+ new DecimalFormat().format(cevre));
        double alfa;
        System.out.print("\nAlfa: ");
        alfa = input.nextDouble();
        System.out.println("\nDaire diliminin alani: " + new DecimalFormat().format((pi*Math.pow(r,2)*alfa)/360));

    }
}
