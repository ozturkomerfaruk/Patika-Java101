package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri giriniz: ");
        int tab = input.nextInt();
        System.out.print("Us degeri giriniz: ");
        int us = input.nextInt();
        System.out.println(MathPow(tab, us));
    }

    static int MathPow(int tab, int us){
        if(us == 0)
            return 1;
       return tab * MathPow(tab, us-1);
    }
}
