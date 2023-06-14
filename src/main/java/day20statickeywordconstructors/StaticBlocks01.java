package day20statickeywordconstructors;

public class StaticBlocks01 {
    //Bir variable oluşturduğunuzda değer atamazsanız o variable'ı initailize etmediniz demektır.
    static double pi;
    static String shape;

    //Bazen main method çalıştırılmadan önce variablelarin hazir hale getirilmesi gerekir
    static{
        pi = 3.14;
        System.out.println("static block 1");
    }

    static{
        shape = "Circle";
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }


}
