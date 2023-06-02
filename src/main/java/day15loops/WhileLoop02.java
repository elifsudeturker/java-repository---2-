package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int num = input.nextInt();
        int i = 1;
        while (i<11) {
            System.out.println(i + "*" + num + "= " + i*num);
            i++;
        }

        System.out.println("Lütfen bir kelime giriniz: ");
        String word = input.next();
        String newWord = "";

        int a = 0;
        while (a<word.length()) {
            newWord = newWord + word.charAt(a)+"*";
            a++;
        }
        System.out.println(newWord);

        String s = "kertenkelle";
        String sonuc = "";
        int b = 0;
        while (b<s.length()) {
            char ch = s.charAt(b);

            if (s.indexOf(ch)==s.lastIndexOf(ch)) {
                sonuc = sonuc + ch;
            }

            b++;
        }
        System.out.println(sonuc);

    }
}
