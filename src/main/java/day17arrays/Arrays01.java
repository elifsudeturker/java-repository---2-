package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int arr[] = {63,19,313,353,7,100,4 };
        System.out.println(Arrays.toString(arr));

        //2. soru
        int sayac = 0;
        for(int w: arr){
            if (w%2==0){
                sayac++;
            }}

        System.out.println("Array'de" + sayac + " adet çift sayı" + (arr.length-sayac) + "adet tek sayı kullanılmıştır." );
        //3. SORU
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cüneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w : stdNames){
            if(w.length()<5){
                System.out.println(w);
            }
        }

        //4.soru
        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for (String w: stdNames){
            if (w.startsWith("F")){
                continue;
            }
                System.out.println(w);

        }

    }
}
