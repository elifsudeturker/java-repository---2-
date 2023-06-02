package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birini sayıyı giriniz: ");
        System.out.println("İki sayı giriniz: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Yapılacak ilemi giriniz: +,-,*,/,% birini seçiniz.");
        char opr = input.next().charAt(0);
        switch (opr){
            case '+':
                System.out.println(a + " + " + b + " = " +  (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " +  (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " +  (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " +  (a / b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " +  (a % b));
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır.");


        }
    }
}
