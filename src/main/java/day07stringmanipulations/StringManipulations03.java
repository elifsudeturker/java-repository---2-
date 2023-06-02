package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
      String s = "      Ali Can       ";
      System.out.println(s);
      String sTrimmed = s.trim();
      System.out.println(sTrimmed);
      /////////////////////////////
      String tv = "%456.99";
      String laptop = "%875.99";
      String tv2 = tv.replace("%","");
      System.out.println(tv2);
      String laptop2 = laptop.replace("%", "");
      System.out.println(laptop2);
      Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
      System.out.println(totalPrice);
      ///////////////////////////////////////
      String name = "aLi cAN";
      char first = name.trim().toUpperCase().charAt(0);
      System.out.println(first);
      char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
      System.out.println(last);
      System.out.println("" + first + last);
    }
}
