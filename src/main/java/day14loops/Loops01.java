package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        String t = "Java";
        String ters = "";
        for (int i = t.length() - 1; i >= 0; i--) {
            ters = ters + t.substring(i, i + 1);

        }
        System.out.println(ters);

        String duz = "ey edip adana pide ye";
        String ters3 = "";
        for (int i = duz.length() - 1 ; i>=0 ; i--) {
            ters3 = ters3+duz.substring(i,i+1);
        }
        if (duz.equals(ters3)){
            System.out.println("Palindromdur");
        }
        else {
            System.out.println("Palindrom değildir.");
        }
    }
}
