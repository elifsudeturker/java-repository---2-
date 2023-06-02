package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen başlangıç değerini giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("Lütfen bitiş değerini giriniz: ");
        int sayi2 = input.nextInt();
        if (sayi1>sayi2){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");
        }else{
            for (int i = sayi1 ; i<sayi2+1 ; i++ ){
                if(i%2==0){
                    System.out.print(i + " ");
                }
            }
        }

        ////////////////////////////////////

        for (int i = 'd'/'d' ; i<='d' ; i++ ){
            System.out.println(i + " ");
        }
    }
}
