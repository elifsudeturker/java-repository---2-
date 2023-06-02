package day12nestedternaryswitchloops;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yılı giriniz: ");
        int yil = input.nextInt();
        String result = yil%100==0 ? (yil%400==0 ? ("Artık yıl") : ("Artık yıl değil.")) : (yil%4==0 ? ("Artık yıl") : ("Artık yıl değil."));
        System.out.println(result);
    }
}
