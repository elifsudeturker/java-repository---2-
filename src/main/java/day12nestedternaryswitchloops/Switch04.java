package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ülke ismi giriniz: ");
        String ulkeIsmi = input.nextLine();
        switch (ulkeIsmi.toLowerCase()){
            case "amerika":
                System.out.println("US");
                break;
            case "türkiye":
                System.out.println("TR");
                break;
            case "england":
                System.out.println("GB");
                break;
            case "almanya":
                System.out.println("DE");
                break;
            case "fransa":
                System.out.println("FR");
                break;
        }

    }
}
