package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        int bosluk = 1;
        int yildiz = 2 * n - 1;

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
