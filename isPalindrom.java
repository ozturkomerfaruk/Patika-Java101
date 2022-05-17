package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = isPalindrom(1225221) ? "Palindrom" : "Degil";
        System.out.println(str);

    }

    static boolean isPalindrom(int num) {

        int temp, last, reverseNum = 0;
        temp = num;
        while(temp != 0){
            last = temp % 10;
            reverseNum = (reverseNum  * 10) + last;

            temp /= 10;
        }

        return num == reverseNum;
    }


}
