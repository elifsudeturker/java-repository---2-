package day15loops;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //////////////////////////////

        System.out.println("Lütfen günü giriniz: ");
        String gun = input.next().toLowerCase();
            switch (gun){
            case "pazartesi" :
            case "salı" :
                System.out.println("Java dersi günleri");
                break;
            case "perşembe":
            case "cuma":
                System.out.println("Selenyum dersi günleri");
                break;
            case "çarşamba":
            case "cumartesi":
                System.out.println("SQL dersi günleri");
                break;
            case "pazar":
                System.out.println("İzin günü!");
                break;
            default:
                System.out.println("Geçersiz");
                break;
            }

        }
    }

