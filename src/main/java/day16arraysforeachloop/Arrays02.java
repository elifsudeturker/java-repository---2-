package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Örnek 1:
        String arr[] = new String[5];
        arr[0]= "Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(arr[0].length()+arr[arr.length-1].length());

        ///////////////////////////////////////////////////////////////
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "İstanbul";
        brr[2] = "Ankara";
        brr[3] = "Oslo";
        brr[4] = "Erzurum";
        int totalChar = 0;

        //1.yol
        for (int i = 0 ; i< brr.length ; i++){
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);

        //2.yol
        int sum = 0;
        for(String w : brr){
            sum = sum + w.length();
        }
        System.out.println(sum);


        int notlar[] = new int[6];
        notlar[0] = 50;
        notlar[1] = 70;
        notlar[2] = 60;
        notlar[3] = 40;
        notlar[4] = 90;
        notlar[5] = 80;

        System.out.println(Arrays.toString((notlar)));

        int toplam = 0;
        for (int w : notlar){
            toplam = toplam + w;
        }

        System.out.println(toplam/notlar.length);
    }
}
