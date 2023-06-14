package day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        //pass by value
        int shirtPrice = 100;
        System.out.println(discount("student",shirtPrice));
        System.out.println(shirtPrice);
        shirtPrice = discount("student",shirtPrice);
        System.out.println("kampanya : " + shirtPrice);

    }

    public static int discount(String type, int price){
        switch(type){
            case "student":
                price = price-10;
                break;
            case "veteran":
                price = price - 20;
                break;
            case "senior":
                price = price - 5;
                break;
            default:
                price = price;

        }
        return price;
    }
}
