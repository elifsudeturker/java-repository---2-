package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz:");
        String gun = input.nextLine();
        if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("1");
        } else if (gun.equalsIgnoreCase("salı")) {
            System.out.println("2");
        } else if (gun.equalsIgnoreCase("çarşamba")) {
            System.out.println("3");
        } else if (gun.equalsIgnoreCase("perşembe")) {
            System.out.println("4");
        } else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("5");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("6");
        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("7");
        } else{
            System.out.println("Geçersiz gün");


        switch (gun.toLowerCase()){
            case "pazartesi":
                System.out.println(1);
                break;
            case "salı":
                System.out.println(2);
                break;
            case "çarşamba":
                System.out.println(3);
                break;
            case "perşembe":
                System.out.println(4);
                break;
            case "cuma":
                System.out.println(5);
                break;
            case "cumartesi":
                System.out.println(6);
                break;
            case "pazar":
                System.out.println(7);
                break;
            default:
                System.out.println("Geçerli gün ismi giriniz");
        }
        }
    }

}
