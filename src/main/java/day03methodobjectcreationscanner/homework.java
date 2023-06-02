package day03methodobjectcreationscanner;

public class homework {
    public static void main(String[] args) {
        //////////////Çevre hesaplama//////////////////
        int yaricap=15;
        cevreHesapla(yaricap);
        alanHesapla(yaricap);
    }

    private static void alanHesapla(int yaricap) {
        System.out.println(yaricap*yaricap*3.14);
    }

    public static void cevreHesapla(int yaricap){
        System.out.println(yaricap*2*3.14);
    }
}
