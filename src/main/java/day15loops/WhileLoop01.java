package day15loops;

public class WhileLoop01 {
    public static void main(String[] args) {
        for (int i = 3 ; i<7 ; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 3;
        while (i<7){
            System.out.println(i +" ");
            i++;
        }
        System.out.println();

        int k = 23;
        while (k > 11){
            if (k%2==0){
                System.out.print(k+ " ");
            }
            k--;
        }

        int l = 6;
        while(l<20){
            if (l%2!=0) {
                System.out.print(l + " ");
            }
            l++;
        }
    }
}
