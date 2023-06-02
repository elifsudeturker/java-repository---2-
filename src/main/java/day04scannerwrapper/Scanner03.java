package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz.");
        double birinciSayi = input.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        double ikinciSayi = input.nextDouble();
        System.out.println("Toplama= " + birinciSayi+ikinciSayi);
        System.out.println("Çıkarma= " + (birinciSayi-ikinciSayi));
        System.out.println("Çarpma= " + (birinciSayi*ikinciSayi));
        System.out.println("Bölme= " + (birinciSayi/ikinciSayi));
    }
}
