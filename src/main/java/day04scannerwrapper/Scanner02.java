package day04scannerwrapper;

import java.util.Scanner;
public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adresinizi giriniz:");
        String address = input.nextLine();
        System.out.println(address);

    }
}
