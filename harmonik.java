package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();
        double top = 0;
        for (int i = 1; i <= n; i++) {
           top = top + 1/(double)i;
        }
        System.out.println(top);
    }
}