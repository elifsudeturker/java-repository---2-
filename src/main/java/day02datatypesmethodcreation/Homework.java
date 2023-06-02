package day02datatypesmethodcreation;

public class Homework {
    public static void main(String[] args) {
        System.out.println(dikdortgenAlan(10,20));
        System.out.println(dikdortgenCevre(10,20));

    }

    //odev1 dikdörtgen alan
    public static int dikdortgenAlan(int a, int b){
        return a*b;
    }
    //odev2 dikdörtgen cevre
    public static int dikdortgenCevre(int a,int b){
        return 2*(a+b);
    }
}
