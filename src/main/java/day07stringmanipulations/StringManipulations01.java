package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String t = "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]i

           8)Kucuk harflerden farkli tum characterler ==>[^a-z]
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]
         */

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);

        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        String t6 = t.replaceAll("[^\\s]", "?");
        System.out.println(t6);

        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);








    }
}
