package day26polymorphism;

public class Student {
    //Encapsulation ==> Kapsülleme
    /*
    Encapsulation nedir? Data Hiding (Veri saklama)
    Data nasıl saklanır?
    Access Modifierlarını private yaparak datayı diğer classlardan görünmez hale getiririm. Böylece datayı saklamış olurum.

     */
    private String stdId = "AC202306014";
    public String StdName = "Ali Can";
    public int age = 13;
    private double notOrt = 3.13;
    private boolean successful = false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return successful;
    }
}
