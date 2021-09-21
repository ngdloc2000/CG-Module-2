package FizzBuzz.test;

import FizzBuzz.src.FizzBuzzTranslate;
import NextDayCalculator.src.NextDayCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @org.junit.jupiter.api.Test
    void Fizz() {
        int num = 3;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(num);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void Buzz() {
        int num = 5;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translate(num);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void FizzBuzz() {
        int num = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translate(num);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void errorProgram() {
        int num = 14;
        String expected = String.valueOf(num);

        String result = FizzBuzzTranslate.translate(num);
        assertEquals(expected, result);
    }
}
