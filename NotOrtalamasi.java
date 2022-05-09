package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fizik, kimya, turkce, tarih, muzik;
        System.out.print("Fizik: ");
        fizik = input.nextFloat();
        System.out.print("Kimya: ");
        kimya = input.nextFloat();
        System.out.print("Türkçe: ");
        turkce = input.nextFloat();
        System.out.print("Tarih: ");
        tarih = input.nextFloat();
        System.out.print("Müzik: ");
        muzik = input.nextFloat();

        float ort = 0;
        ort = (fizik + kimya + turkce + tarih + muzik) / 5;

        System.out.println("Ortalama: " + ort);

        String durum = "";
        durum = ort > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);

    }
}
