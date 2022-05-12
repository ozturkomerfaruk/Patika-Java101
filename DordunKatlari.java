package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int num;
        int total = 0;
        while (true) {
            System.out.print(i + ". sayiyi giriniz: ");
            num = input.nextInt();

            if (num % 4 == 0)
                total += num;

            if (num % 2 == 1)
                break;
            i++;
        }
        System.out.println("4'un katlari olan sayilarin toplami: " + total);
    }
}