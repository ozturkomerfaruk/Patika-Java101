package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int num1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int num2 = input.nextInt();
        int ebob = 0;

        int i=1;
        while(i <= num1){
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        System.out.println("Ebob: " + ebob);

        int ekok = (num1 * num2) / ebob;
        System.out.println("Ekok " + ekok);
    }
}
