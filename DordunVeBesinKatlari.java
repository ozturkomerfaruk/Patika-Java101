package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}