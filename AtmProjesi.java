package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int right = 3;
        int balance = 1500;
        int select = 0;

        while (right > 0) {
            System.out.print("Kullanici Adiniz: ");
            username = input.nextLine();
            System.out.print("Parolaniz: ");
            password = input.nextLine();

            if (Objects.equals(username, "patika") && Objects.equals(password, "dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz");
                do {
                    System.out.println("1-Para Yatirma\n2-Para Cekme\n3-Bakiye Sorgulama\n4-Cikis Yapma");
                    System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz");
                    select = input.nextInt();
                    switch (select) {
                        case 1: {
                            System.out.print("Para Miktari: ");
                            int paraMiktari = input.nextInt();
                            balance += paraMiktari;
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        }
                        case 2: {
                            System.out.print("Para Miktari: ");
                            int paraMiktari = input.nextInt();
                            if (paraMiktari > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= paraMiktari;
                            }
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        }
                        case 4: {
                            System.exit(0);
                        }
                        default:
                            System.exit(0);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar Deneyiniz. Kalan hakkiniz: " + right);
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime geciniz.");
                }

            }
        }
    }
}
