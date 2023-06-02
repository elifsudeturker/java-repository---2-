package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 13;
        String stdNames [] = new String[5];

        stdNames[4] = "Benna";
        stdNames[3] = "Abdullah";
        stdNames[2] = "Recep";
        stdNames[1] = "Ekim";
        stdNames[0] = "Elif Sude";
        System.out.println(Arrays.toString(stdNames));

        System.out.println(stdNames[4]);

        for (int i = 0 ; i< stdNames.length ; i++){
            System.out.println(stdNames[i] + "!");
        }


    }
}
