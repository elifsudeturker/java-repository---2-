package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonucu=multiply(50,35);
        System.out.println(carpmaSonucu);


        System.out.println(carptopla(5,10,32));

    }
    public static int toplamaYap(int a, int b){
       return a+b;
    }
    protected static long multiply(int a, int b){
        return a*b;
    }

    public static int carptopla(int a, int b, int c){
        return a*b+c;
    }

}
