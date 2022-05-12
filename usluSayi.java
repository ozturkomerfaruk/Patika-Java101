package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();
        System.out.print("pow: ");
        int r = input.nextInt();
        int total = 1;
        for(int i=1; i<=r; i++) {
            total = total * n;
        }
        System.out.println("Total: "+ total);
    }
}