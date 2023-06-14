package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1) StringBuilder classi da string ureten bir classtir.
        2) String class kullanarak string ureteriz java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez)  string uretir.
            StringBuilder "mutable" (degistirilebilir) string uretir.
        3)"Immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir
          "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir
         */
        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String i degistirdikten sonra ayni String e assign ederseniz, Java yine yeni bir container olusturur
        //Degismis degeri bu yeni container in icine koyar ve eski container i gosteren pointer yeni container a yonlendirilir
        //Dolayisiyla eski container adressiz kalir, ve garbage collector adressiz olan contanirlari siler
        String a = "Money";
        a = a + "More";


        //Mutable
        //StringBuilder kullanarak string uretmenin 1. yolu:
        StringBuilder sb1 = new StringBuilder("Python");

        System.out.println(sb1);//Python

        sb1.append("!");

        System.out.println(sb1);//Python!

        // StringBuilder kullanarak string üretmenin 2. yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());


        sb2.append("Java");
        sb2.append("XXXXXXXXXXXX");

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        //Defualt capacity i nasil degistirebiliriz?
        StringBuilder sb3= new StringBuilder(3);
        sb3.append("ali");
        System.out.println(sb3.capacity());//3
        System.out.println(sb3.length());//3

    }
}