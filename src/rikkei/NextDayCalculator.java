package rikkei;

import java.time.LocalDate;

public class NextDayCalculator {
//    public static void main(String[] args) {
//        LocalDate date1 = LocalDate.now();
//
//        System.out.println(date1.plusDays(1));
//    }
    public static LocalDate nextDay(LocalDate date){
        return date.plusDays(1);
    }
}
