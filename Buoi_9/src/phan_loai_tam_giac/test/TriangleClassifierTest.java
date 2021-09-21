package phan_loai_tam_giac.test;

import NextDayCalculator.src.NextDayCalculator;
import phan_loai_tam_giac.src.TriangleClassifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @org.junit.jupiter.api.Test
    void tamGiacVuong() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Day la tam giac vuong";

        String result = TriangleClassifier.kiemTraTamGiac(a, b, c);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void tamGiacCan() {
        int a = 3;
        int b = 3;
        int c = 5;
        String expected = "Day la tam giac can";

        String result = TriangleClassifier.kiemTraTamGiac(a, b, c);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void khongPhaiLaTamGiac() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "khong phai la tam giac";

        String result = TriangleClassifier.kiemTraTamGiac(a, b, c);
        assertEquals(expected, result);
    }
}
