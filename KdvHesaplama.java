package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float kdv = 18;
        System.out.print("Bir Fiyat Giriniz: ");
        float fiyat = input.nextFloat();
        float kdvliFiyat = fiyat;
        float kdvMiktari;


        if(fiyat > 0 && fiyat < 1000) {
            System.out.println("KDV'siz fiyat: " + fiyat);
            kdvliFiyat += fiyat*18/100;
            System.out.println("KDV'li fiyat: " + kdvliFiyat);
            System.out.println("KDV tutarı: " + new DecimalFormat().format((kdvliFiyat - fiyat)));
        } else if (fiyat > 1000) {
            System.out.println("KDV'siz fiyat: " + fiyat);
            kdvliFiyat += fiyat*8/100;
            System.out.println("KDV'li fiyat: " + kdvliFiyat);
            System.out.println("KDV tutarı: " + new DecimalFormat().format((kdvliFiyat - fiyat)));
        }



    }
}
