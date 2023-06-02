package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk isminizi giriniz:");
        String firstName = input.next();
        System.out.println("Soyisminizi giriniz:");
        String lastName = input.next();
        System.out.println(firstName + " " + lastName);
    }
}
