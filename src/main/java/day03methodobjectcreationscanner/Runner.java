package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
    //Class ismi + Object ismi + Assignment Operator + "new" keywordu + Constructor
          Car          myCar               =                 new           Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        /////////////////////////////////
        Student aliCan = new Student();

        System.out.println("aliCan.grade = " + aliCan.grade);
        System.out.println("aliCan.adress = " + aliCan.adress);
        aliCan.feed();
        aliCan.study();
    }
}
