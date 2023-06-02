package day15loops;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //Soru 4: Klavyeden girilen herhangi bir sayının faktöriyel değerini bulan programı yazınız.
        Scanner input = new Scanner(System.in);
            System.out.println("Lütfen faktöriyel hesaplamak için bir sayı giriniz: ");
            int sayi = input.nextInt();
            int carpim = 1;
            for (int i = sayi ; i>0 ; i--){
                carpim = carpim * i;
            }
            System.out.println("Girdiğiniz sayının faktöriyeli: " + carpim);

            //
        System.out.println("Lütfen üslü sayının tabanını giriniz: ");
        int taban = input.nextInt();
        System.out.println("Lütfen üslü sayının üssünü giriniz: ");
        int us = input.nextInt();
        int sonuc = 1;
        for (int i = 1 ; i<=us ; i++){
        sonuc*=taban;
        }
        System.out.println("Sonuç: " + sonuc);

        //Soru 6 Kullanıcıdan bir tamsayı girmesini isteyen ve ardından sayıları ters çevirerek sayıyı veren bir program yazınız. Örneğin, giriş 12345 ise çıkış 54321 olmalıdır.
        System.out.println("Lütfen bir tamsayı giriniz: ");
        String sayi3 = input.next();
        for (int i = sayi3.length()-1 ; i>=0  ; i--){
            System.out.print(sayi3.charAt(i) + "");
        }

        //Soru 7 Bir dizi tam sayıyı okuyan ve ardından çift ve tek tam sayıların toplamını bulan bir program yazınız.
        System.out.println("Lütfen başlangıç değerini giriniz: ");
        int ilk = input.nextInt();
        System.out.println("Lütfen bitiş değerini giriniz: ");
        int son = input.nextInt();
        int toplam1 = 0;
        int toplam2 = 0;
        for (int s = ilk ; s<son; s++){
            if (s%2==0){
                toplam1 += s;
            }else{
                toplam2 += s;
            }
        }
        System.out.println("Çift sayıların toplamı: " + toplam1);
        System.out.println("Tek sayıların toplamı: " + toplam2);

        System.out.println("Satır sayısını giriniz: ");
        int satir = input.nextInt();
        System.out.println("Sütun sayısını giriniz: ");
        int sutun = input.nextInt();
        for (int i = 1 ; i<=satir ; i++){
            System.out.println(i);
            for (int k = 1 ; k<=sutun ; k++){
                System.out.print(k + " ");
            }

        }
    }
}