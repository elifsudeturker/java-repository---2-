package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        String a = "abc@hotmail.com";
        int startingIndex = a.indexOf("@")+1;
        int endingIndex = a.indexOf(".");
        String companyName = a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);


        //Ornek 2:Verilen iki string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali Can";
        String i = "Ali Can";
        boolean result =h.equals(i);
        System.out.println(result);//false

        //Java da Memory kullanimi
        /*
        java da iki tane memory vardir
        1)Stack Memory ==> small
            a)Kucuk memorydir
            b)Primitive leri ve Non-Primitivelerin adreslerini (reference) tutar

        2) Heap Memory ==> Huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur
            ve bu adresi stack memory de saklar
         */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir

         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        System.out.println(s==t);
        System.out.println(s.equals(t));
        System.out.println(s==r);

        String j = "ali Can";
        String k = "Ali Can";
        System.out.println(j==k);
        System.out.println(j.equalsIgnoreCase(k));


    }
}
