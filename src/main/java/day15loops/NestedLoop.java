package day15loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satır (row) sayısını giriniz: ");
        int row = input.nextInt();
        for (int i = 1 ; i<=row ; i++){
            for (int k = 1 ; k<=i ; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
