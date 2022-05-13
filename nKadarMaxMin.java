package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz?");
        int n = input.nextInt();
        int max = 0, min = 0;

        System.out.print("1. sayiyi giriniz: ");
        int num1 = input.nextInt();

        System.out.print("2. sayiyi giriniz: ");
        int num2 = input.nextInt();

        if(num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        for (int i = 3; i <= n; i++) {
            System.out.print(i + ". sayiyi giriniz: ");
            int num = input.nextInt();
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        System.out.println("Max: " + max + "\nMin: " + min);
    }
}
