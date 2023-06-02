package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {
        double kup = getCube(1.27);
        System.out.println("küp = " + kup);

        print("Java is easy!!");


        String str ="TechproEdu";
        printConsole(str);

        int a=15;
        int b=3;
        carpmaYap(a,b);

        int kenar=12;
        kareBul(kenar);
    }

    private static void kareBul(int kenar) {
        System.out.println(kenar*kenar);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    public static void printConsole(String str) {
        System.out.println(str);
    }

    static double getCube(double a) {
        return a * a * a;
    }


    public static void print(String str){
        System.out.println(str);
    }

}
