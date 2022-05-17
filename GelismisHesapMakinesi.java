package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = -1;
        while(true) {
            System.out.println("0- Cikis");
            System.out.println("1- Toplama Islemi");
            System.out.println("2- Cikarma Islemi");
            System.out.println("3- Carpma Islemi");
            System.out.println("4- Bolme Islemi");
            System.out.println("5- UslU Sayi Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdortgen Alan ve Cevre Hesabi");
            System.out.print("Seciniz: ");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            switch (n) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1 : {
                    ToplamaIslemi();
                    break;
                }
                case 2 : {
                    CikarmaIslemi();
                    break;
                }
                case 3 :{
                    CarpmaIslemi();
                    break;
                }
                case 4 : {
                    BolmeIslemi();
                    break;
                }
                case 5 : {
                    UsluSayiHesaplama();
                    break;
                }
                case 6 : {
                    FaktoriyelHesaplama();
                    break;
                }
                case 7 : {
                    ModAlma();
                    break;
                }
                case 8 : {
                    DikdortgenAlanVeCevreHesabi();
                    break;
                }
                default : {
                    System.out.println("HATA! Sadece 1-8 Arasi");
                    break;
                }
            }
        }
    }

    static void ToplamaIslemi() {
        System.out.println("Toplama Islemi");
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.println(a+b);
    }

    static void CikarmaIslemi() {
        System.out.println("Cikarma Islemi");
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.println(a-b);
    }

    static void CarpmaIslemi() {
        System.out.println("Carpma Islemi");
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.println(a*b);
    }

    static void BolmeIslemi() {
        System.out.println("Bolme Islemi");
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.println(a/b);
    }

    static void UsluSayiHesaplama() {
        System.out.println("Uslu Sayi Hesaplama");
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.println(Math.pow(a, b));
    }

    static void FaktoriyelHesaplama() {
        System.out.println("Faktoriyel Hesaplama");
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }

    static void ModAlma() {
        System.out.println("Uslu Sayi Hesaplama");
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.println(a % b);
    }

    static void DikdortgenAlanVeCevreHesabi() {
        System.out.println("Uslu Sayi Hesaplama");
        Scanner input = new Scanner(System.in);
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.println("Alan: " + a * b);
        System.out.println("Cevre: " + (a + b) * 2);
    }
}
