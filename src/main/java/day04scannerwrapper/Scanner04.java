package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarının uzunluğunu giriniz.");
        double kisaKenar = input.nextDouble();
        System.out.println("Dikdörtgenin uzun kenarının uzunluğunu giriniz:");
        double uzunKenar = input.nextDouble();
        System.out.println("Dikdörtgenin alanı: " + kisaKenar*uzunKenar);
        System.out.println("Dikdörtgenin çevresi: " + 2*(kisaKenar+uzunKenar));
    }
}
