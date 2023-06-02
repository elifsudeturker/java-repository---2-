package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {
        String students[][] = {{"Ali" , "Can"},{"Kemal"},{"Ayhan" , "Beyhan" , "Seyhan"},{"Ceyhan", "Kayahan"}};
        for (String[] w: students){
            for(String k: w){
                if(k.contains("m")){
                    System.out.println(k);
                }
            }
        }

        //
        int nums[][]={{5,4},{2,3,2},{7}};
        int sonuc = 1;
        for (int[] w: nums){
            for(int k: w){
               sonuc = sonuc*k;
            }
        }
        System.out.println(sonuc);
    }
}
