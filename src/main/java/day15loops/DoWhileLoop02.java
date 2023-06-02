package day15loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bir sayı giriniz.");
            int num = input.nextInt();

            if (num>=100) {
                System.out.println("Kazandınız!");
            }else{
                System.out.println("Kaybettiniz!");
                break;
            }
        }while(true);
    }
}
