package day15loops;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Lütfen iş ünvanınızı giriniz: ");
            String jobTitle = input.next();
            if(jobTitle.equalsIgnoreCase("qa") ){
                System.out.println("Quality Analist");
                break;
            } else if (jobTitle.equalsIgnoreCase("dev")) {
                System.out.println("Developer");
                break;
            } else if(jobTitle.equalsIgnoreCase("ba") ){
                System.out.println("Business Analyst");
                break;
            } else if (jobTitle.equalsIgnoreCase("pm") ) {
                System.out.println("Project Manager");
                break;
            }else{
                System.out.println("Geçerli bir ünvan giriniz.");
            }
        }while(true);

    }
}
