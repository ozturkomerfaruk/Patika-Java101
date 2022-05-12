package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();

        int yildiz = 1;
        int bosluk = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            System.out.println();
            yildiz += 2;
            bosluk--;
        }
        yildiz = 2*n-3;
        bosluk = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildiz; j++) {
                System.out.print("*");
            }
            System.out.println();
            yildiz -= 2;
            bosluk++;
        }
    }
}