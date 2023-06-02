package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        int a [][] = new int[3][2];
        a[0][0] = 5;
        a[0][1] = 45;
        a[1][0] = 123;
        a[1][1] = 12;
        a[2][0] = 81;
        a[2][1] = 0;

        System.out.println(Arrays.deepToString(a));
        System.out.println(a[1][1]);
        System.out.println(a[2][0]);

        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[2]));

        String students[][] = {{"Ali" , "Can"},{"Cemal"},{"Ayhan" , "Beyhan" , "Seyhan"},{"Ceyhan", "Kayahan"}};
        int sum = 0;
        for(String []  w: students){
            sum = sum + w.length;
        }
        System.out.println(sum);
    }
}
