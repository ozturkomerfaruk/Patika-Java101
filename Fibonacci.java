package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kac elemanli olsun: ");
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int next = 1;
        System.out.print(first + "\t" + second + "\t");
        for(int i=1; i<n; i++){
            //System.out.println(first + " + " + second + " = " + (temp + first));
            System.out.print((next + first) + "\t");
            next = first + second;
            first = second;
            second = next;
        }


    }
}