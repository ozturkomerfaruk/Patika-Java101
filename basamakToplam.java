package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();
        int count = 0, temp = n, son = 0, toplam = 0;
        while (temp != 0) {
            son = temp % 10;
            temp /= 10;
            System.out.println(son);
            toplam += son;
            count++;
        }
        System.out.println("Basamak sayi: " + count);
        System.out.println("Basamak toplam: " + toplam);
    }
}