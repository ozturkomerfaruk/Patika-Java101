package com.company;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adi: ");
        String username = input.nextLine();
        System.out.print("Sifre: ");
        String password = input.nextLine();

        String kayitliKullaniciAdi = "patika", kayitliSifre = "java123";

        if(Objects.equals(username, kayitliKullaniciAdi) && Objects.equals(password, kayitliSifre)) {
            System.out.println("Giris Yapildi");
            System.exit(0);
        } else {
            System.out.println("Bilgileriniz Yanlis");
            System.out.println("Sifrenizi sifirlamak ister misiniz? Evet ise 1 Hayır ise 2'ye basiniz.");
        }
        int n = input.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("Yeni sifreniz bir onceki sifre ile ayni olamaz");
                System.out.print("Yeni sifrenizi giriniz: ");
                Scanner newInput = new Scanner(System.in);
                String newPassword = newInput.nextLine();
                if (!Objects.equals(newPassword, "java123")) {
                    System.out.println("Sifre Olusturuldu");
                    password = newPassword;

                    System.out.println("Guncel sifre: " + password);
                } else {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                }
            }
            case 2 -> System.out.println("Programdan Cikisiniz Gerceklestirildi.");
            default -> {
                System.out.println("Sadece 1 ve 2 degeri girebilirdiniz. Zorunlu cikis yapildiniz.");
                System.exit(0);
            }
        }


    }
}
