package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yil giriniz: ");
        int year = input.nextInt();
        if(year % 400 == 0) {
            System.out.println(year + " bir artik yildir!");
            System.exit(0);
        }
        else {
            System.out.println(year + " bir artik yil degildir!");
            System.exit(0);
        }
        if(year % 4 == 0) {
            System.out.println(year + " bir artik yildir!");
        }
        else {
            System.out.println(year + " bir artik yil degildir!");
        }

    }
}