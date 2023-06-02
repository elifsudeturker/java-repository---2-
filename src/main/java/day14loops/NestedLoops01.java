package day14loops;

public class NestedLoops01 {
    public static void main(String[] args) {
        for (int i =1; i<5 ; i++ ){
            System.out.println("Week: " + i);
            for (int a = 1 ; a<8 ; a++ ){
                System.out.println("Day: " + a );
            }
        }
    }
}
