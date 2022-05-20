package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();
        String str = isPrimeRecursive(n, 2) ? "Asal" : "Degil";
        System.out.println(str);
    }

    static boolean isPrimeRecursive(long n, int i) {
        if(i >= n/2 || n == 2)
            return true;
        if(n < 2 || i < 2 || n % i == 0)
            return false;
        return isPrimeRecursive(n, i+1);
    }
}
