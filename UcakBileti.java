package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km turunden giriniz: ");
        int mesafe = input.nextInt();
        if (mesafe <= 0) {
            System.out.println("Negatif olamaz");
            System.exit(0);
        }
        System.out.println("Yasinizi giriniz: ");
        int yas = input.nextInt();
        if (yas <= 0) {
            System.out.println("Negatif olamaz");
            System.exit(0);
        }
        System.out.print("Yolculuk tipi seciniz\n1: Tek Yon \n2: Gidis-Donus\nSeciminiz: ");
        int tip = input.nextInt();
        if (tip != 1 && tip != 2) {
            System.out.println("Sadece 1 ve 2 olmali");
            System.exit(0);
        }
        double total = 0;
        total = mesafe * .10;
        if (yas < 12) {
            total = total / 2;
        } else if (yas > 12 && yas < 24) {
            total = total * 9 / 10;
        } else if (yas > 65) {
            total = total * 7 / 10;
        }
        if (tip == 2) {
            total = total * 8 / 10;
            total *= 2;
        }

        System.out.println("Toplam tutar: " + total);
    }
}