package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.print(fibb(i) + "\t");
        }
    }

    static long fibb(long n) {

        if(n < 0)
            return -1;
        if(n == 1 || n == 2)
            return 1;

        return fibb(n-1) + fibb(n-2);

    }


}
