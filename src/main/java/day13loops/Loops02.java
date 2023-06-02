package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        ///Örnek 1: 21'den 180'e kadar hem 2 hem de 3 ile bölünebilen tam sayıları ekrana yazdırınız.
        for ( int i = 21 ; i < 181 ; i++){
            if (i%2==0 && i%3==0) {
                System.out.print(i + " ");
            }
        }

        String s = "Ankaralı mehmet";
        for(int i = 0 ; i<s.length() ; i++){
            String ch = s.substring(i,i+1);
            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }


        String s1 = "Tramvay";
        for (int i=0 ; i<s1.length() ; i++) {
            if(s1.charAt(i)=='a'){
                break;
            }
            System.out.print(s1.charAt(i));
        }

        String t = "germany";
        for (int i = t.length()-1 ; i>=0 ; i--){
            if(s1.charAt(i)=='a'){
                break;
            }
            System.out.println(t.charAt(i));
        }
}   }
