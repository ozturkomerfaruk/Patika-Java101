package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi 1: ");
        int num1 = input.nextInt();
        System.out.print("sayi 2: ");
        int num2 = input.nextInt();
        System.out.print("sayi 3: ");
        int num3 = input.nextInt();
        int max = 0, min = 0;

        if(num1>num2 && num1>num3){
            max = num1;
            if(num2>num3)
                min=num3;
            else
                min=num2;
        } else if (num2> num1 && num2>num3) {
            max = num2;
            if(num1 > num3)
                min = num3;
            else
                min = num1;
        } else {
            max = num3;
            if(num1 > num2)
                min = num2;
            else
                min = num1;
        }
        System.out.println("Max: "+ max + " Min: "+ min);
    }
}
4