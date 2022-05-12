package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();
        double avg = 0;
        int count = 0;
        for (int i=0; i<=num; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                avg += i;
                count++;
            }
        }
        System.out.println("Ortalama: " + avg / (count - 1));

        
    }
}