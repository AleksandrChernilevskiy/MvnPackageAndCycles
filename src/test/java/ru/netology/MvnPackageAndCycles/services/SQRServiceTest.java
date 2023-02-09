package ru.netology.MvnPackageAndCycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrtCalc.csv")
    public void shouldCalcExact(int expected, int lowBorder, int upBorder) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(lowBorder, upBorder);
        Assertions.assertEquals(expected, actual);
    }
}