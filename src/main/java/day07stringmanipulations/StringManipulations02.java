package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz:");
        String pwd =input.nextLine();
        boolean first = pwd.length()>7;
        System.out.println("first: "+first);
        boolean second = !pwd.contains(" ");
        System.out.println("second:"+second);
        boolean third = pwd.replaceAll("[^A-Z]", " ").length()>0;
        System.out.println("third = " + third);
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("fourth = " + fourth);
        boolean fifth = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("fifth = " + fifth);
        System.out.println("Password geçerli mi? " + (first&&second&&third&&fourth&&fifth));
    }
}
