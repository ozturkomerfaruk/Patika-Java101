package com.company;

public class Main {

    public static void main(String[] args) {

        boolean asalMi = false;
        for(int n = 1; n<= 100; n++) {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    asalMi = false;
                    break;
                } else {
                    asalMi = true;
                }
            }
            if(asalMi) {
                System.out.print(n +"\t");
            }
        }


    }
}