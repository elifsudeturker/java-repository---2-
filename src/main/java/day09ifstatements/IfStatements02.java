package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int num = input.nextInt();

        if (num%2==0) {
            System.out.println("Çift sayı");
        }
        if (num%2!=0) {
            System.out.println("Tek sayı");
        }

        /////////////////////////

        if (num%2==0) {
            System.out.println("Çift sayı");
        }
        else {
            System.out.println("Tek sayı");
        }
    }
}
