package day18multidimensionalarray;

public class Md04 {
    public static void main(String[] args) {
        int ages[][] = {{15,4},{12,43,21}};
        int small = ages[0][0];

        for(int[] w: ages){
            for (int k: w){
                small = Math.min(small, k);
            }
        }
    }
}
