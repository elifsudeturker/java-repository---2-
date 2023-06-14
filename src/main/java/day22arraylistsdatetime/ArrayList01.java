package day22arraylistsdatetime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for (Double w: prices){
            if (prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.println("Tekrarsız " + w);
            }
        }

        //Örnek 2: Bir listdeki tekrarlı eleman olup olmadığını bulan kodu console a yazınız
        List<Integer> heights = List.of(3, 13, 3);
        int tekrar = 0;
        for (Integer w: heights){
            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                tekrar++;
                break;
            }
        }
            if(tekrar ==0){
                System.out.println("Bu listede tekrarlı eleman yoktur");
            }else{
                System.out.println("Bu listede en az 1 tane tekrarlı eleman vardır");
            }

    }
}
