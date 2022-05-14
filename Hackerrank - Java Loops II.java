package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = input.nextInt();

        for(int i=0; i<counter; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            for(int j=0; j<n; j++){
                a += b * (int) Math.pow(2,j);
                System.out.print(a + "\t");
            }
            System.out.println();
        }

    }
}