package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen eklemek istediğiniz öğrenci sayısını giriniz");
        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements];
        System.out.println("İşlemi durdurmak için q'ya basınız");
        for (int i = 0 ; i < stdNames.length ; i++){
            System.out.println((i+1) + ". öğrencinin ismini giriniz");
            String name = input.next();
            if (name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames));
    }
}
