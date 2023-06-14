package day22arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {

        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);

        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);
        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);
        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);

        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);

        //ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(3));

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(20).minusMonths(2).minusDays(5));

        LocalDate date1 = LocalDate.of(2007,6,17);
        LocalDate date2 = LocalDate.of(2005,6,17);


        //bir tarihin bir tarihten sonra olup olmadığı nasıl kontrol edilir?
        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);

        boolean r2 = date1.isBefore(date1);
        System.out.println(r2);

        boolean r3 = date1.isEqual(date2);
        System.out.println(r3);
    }
}
