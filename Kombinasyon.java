package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();
        System.out.print("r: ");
        int r = input.nextInt();

        if(r > n) {
            System.out.println("r n'den buyuk olamaz");
            System.exit(0);
        }
        int nFact = 1;
        for(int i=1; i<=n; i++) {
            nFact = i * nFact;
        }
        System.out.println("nFact: " + nFact);
        int rFact = 1;
        for(int i=1; i<=r; i++) {
            rFact = i * rFact;
        }
        System.out.println("rFact: " + rFact);
        int co = (n-r);
        int coFact = 1;
        for(int i=1; i<=co; i++) {
            coFact = i * coFact;
        }
        System.out.println("coFact: " + coFact);
        double total = nFact / (rFact * coFact);
        System.out.println("Kombinasyon: "+total);
    }
}