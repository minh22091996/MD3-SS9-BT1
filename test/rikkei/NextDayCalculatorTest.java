package rikkei;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testNextDay() {
        LocalDate date = LocalDate.of(2018,1,1);
        LocalDate expected = LocalDate.of(2018,1,2);
        LocalDate result = NextDayCalculator.nextDay(date);
        assertEquals(expected,result);
    }
    @Test
    void testNextDay1(){
        LocalDate date = LocalDate.of(2018,1,31);
        LocalDate expexted = LocalDate.of(2018,2,1);
        LocalDate result = NextDayCalculator.nextDay(date);
        assertEquals(expexted,result);
    }

    @Test
    void testNextDay2(){
        LocalDate date = LocalDate.of(2018,4,30);
        LocalDate expected = LocalDate.of(2018,5,1);
        LocalDate result = NextDayCalculator.nextDay(date);
        assertEquals(expected,result);
    }

    @Test
    void testNextDay3(){
        LocalDate date = LocalDate.of(2018,2,28);
        LocalDate expected = LocalDate.of(2018,3,1);
        LocalDate result = NextDayCalculator.nextDay(date);
        assertEquals(expected,result);
    }

    @Test
    void testNextDay4(){
        LocalDate date = LocalDate.of(2020,2,29);
        LocalDate expected = LocalDate.of(2020,3,1);
        LocalDate result = NextDayCalculator.nextDay(date);
        assertEquals(expected,result);
    }

    @Test
    void testNextDay5(){
        LocalDate date = LocalDate.of(2018,12,31);
        LocalDate expected = LocalDate.of(2019,1,1);
        LocalDate result = NextDayCalculator.nextDay(date);
        assertEquals(expected,result);
    }




}