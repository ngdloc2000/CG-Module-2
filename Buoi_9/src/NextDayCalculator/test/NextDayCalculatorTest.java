package NextDayCalculator.test;

import NextDayCalculator.src.NextDayCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {
    @org.junit.jupiter.api.Test
    void Thang2() {
        int day = 1;
        int month = 2;
        int year = 2000;
        String expected = "2 2 2000";

        String result = NextDayCalculator.check(day, month, year);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void CuoiNam() {
        int day = 31;
        int month = 12;
        int year = 2000;
        String expected = "1 1 2001";

        String result = NextDayCalculator.check(day, month, year);
        assertEquals(expected, result);
    }
}
