package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    //İki boyutlu bir arrayi tek boyutlu bir array'e çeviriniz:
    public static void main(String[] args) {
        int numbers[][] = {{5,4},{2,3,2}};
        int toplamElemanSayisi = 0;
        for(int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);

        int idx = 0;
        int newArr[] = new int[toplamElemanSayisi];
        for (int [] w: numbers){
            for (int k: w){
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

    }
}
