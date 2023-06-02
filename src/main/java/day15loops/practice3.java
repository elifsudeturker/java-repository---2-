package day15loops;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Lütfen A/B/C birini giriniz: ");
        char ch = input.next().toLowerCase().charAt(0);
        switch(ch){
            case 'a':
                System.out.println("Java is easy.");
                break;
            case 'b':
                System.out.println("Java is fun");,
                break;
            case 'c':
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("Geçerli bir harf giriniz.");
                break;
        }*/

        int sayi = input.nextInt();
        if (sayi%2==0){
            System.out.println("Çift sayı");
        } else if (sayi%2!=0) {
            System.out.println("Tek sayı");
        }
    }
}
