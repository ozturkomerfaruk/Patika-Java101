package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double startPrice = 10, total = 0, perKm = 2.20, km;
        System.out.print("KM: ");
        km = input.nextInt();
        total = startPrice + km*perKm < 20 ? 20 : startPrice + km*perKm;
        System.out.printf("\nTotal: " + new DecimalFormat().format(total));
    }
}
