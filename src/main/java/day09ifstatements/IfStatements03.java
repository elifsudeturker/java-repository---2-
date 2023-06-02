package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Lütfen bir karakter giriniz:");
       char ch = input.next().charAt(0);

       if (ch >='A' && ch <='Z'){
           System.out.println("Büyük harf");
       }
        if (ch >='a' && ch <='z'){
            System.out.println("Küçük harf");
        }

        if (ch >='A' && ch <='Z'){
            System.out.println("Büyük harf");
        }else if (ch >='A' && ch <='Z') {
            System.out.println("Küçük harf");
        }else{
            System.out.println("Harf değil.");
        }
    }
}
