package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);

        sb1.deleteCharAt(6);
        System.out.println(sb1);

        sb1.delete(4,7);
        System.out.println(sb1);

        sb1.replace(2,5,"0");
        System.out.println(sb1);

        sb1.insert(3,"xxx");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Kava");
        StringBuilder sb3 = new StringBuilder("Hava");

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        String str = sb2.toString().toUpperCase();
        System.out.println(str);

        StringBuilder newSb2=new StringBuilder(str);
        System.out.println(newSb2);
    }
}
