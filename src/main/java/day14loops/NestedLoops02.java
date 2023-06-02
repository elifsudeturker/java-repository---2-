package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz: ");
        int row = input.nextInt();
        System.out.println("Lütfen sütun sayısını giriniz: ");
        int column = input.nextInt();
        for (int i = 1 ; i<=row ; i++){
            for (int k = 1 ; k<=column ; k++){
                System.out.print("X ");
            }
            System.out.println(" ");
        }
    }
}
