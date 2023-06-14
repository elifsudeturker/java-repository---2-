package day20statickeywordconstructors;

public class Car {
    /*
    Constructor nedir?
    Classdan object oluşturmamaıza yarayan code blocklarıdır.Class olusturdugumuzda java bize otomatik olarak bir constructor verir.
    Ama bu constructor gozle gorulmez,
    gozle gorulmeyen otomatik olarak java tarafindan verilen bu constructorlara default constructor denir
     */

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;
    public Car(String make, String model, int year, boolean hybrid){
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String make,String model){
        this.make=make;
        this.model=model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
