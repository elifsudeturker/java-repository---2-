package day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 5 ; i<9 ; i++){
            toplam += i;
        }
        System.out.println(toplam);

        ///////////////////////////////////

        int multiply=1;
        for ( int i = 7 ; i<10 ; i++ ){
            multiply = multiply * i;

        }
        System.out.println(multiply);

        ///////////////////////////////

        int toplam2 = 0;
        int n = -578;
        n = Math.abs(n);


        for (int i = n; i > 0; i = i / 10) {
            toplam2 = toplam2 + i % 10;
        }
        System.out.println(toplam2);

    }

}
