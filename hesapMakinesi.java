package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayi: ");
        int num1 = input.nextInt();
        System.out.print("İkinci sayi: ");
        int num2 = input.nextInt();
        System.out.println("\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        int n = input.nextInt();
        double res = 0;
        String str = "";
        switch (n) {
            case 1: res = num1 + num2;
                break;
            case 2: res = num1 - num2;
                break;
            case 3: res = num1 * num2;
                break;
            case 4: if(num2 == 0) {
                str = "0'a bolunemez!";
            } else {
                res = Double.valueOf(num1) / Double.valueOf(num2);
            }
                break;
            default:
                str = "Sadece 1-2-3-4";
                break;
        }
        if(str == ""){
            System.out.println("Sonuc: " + res);
        } else {
            System.out.println(str);
        }
    }
}
