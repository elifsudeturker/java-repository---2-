package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        ///////ODEV 1////////
        String first = "no pain no gain 12317";
        int firstSonuc = first.replaceAll("[0-9]", "" ).length();
        System.out.println("1. Ödev: " + firstSonuc);
        ///////ODEV 2////////
        String second = "stay determined learn java";
        String substring = second.substring(1,25);
        String second2 = substring.toUpperCase();
        System.out.println("2. Ödev: " + second2.toUpperCase());
        ///////ODEV 3////////
        String third = "Java wants determination";
        int char1 = third.charAt(0);
        int char2 = third.charAt(third.length()-1);
        System.out.println("3. Ödev:" + char1 + char2);
        ///////ODEV 4////////
        String fourth = "mAlAtyA";
        String fourth2 = fourth.toUpperCase().charAt(0) + fourth.toLowerCase().substring(1);
        System.out.println("4. Ödev: " + fourth2);
        ///////ODEV 5////////
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz: ");
        String sifre = input.nextLine();
        boolean s1 = sifre.length() > 5;
        boolean s2 = sifre.replaceAll("[^A-Z]","").length()>0;
        boolean s3 = sifre.replaceAll("[^a-z]", "").length()>0;
        boolean s4 = sifre.replaceAll("[^0-9]", "").length()>0;
        System.out.println("4. Odev (Şifre geçerli mi?):" + (s1&&s2&&s3&&s4));




    }
}
