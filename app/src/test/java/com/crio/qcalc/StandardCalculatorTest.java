
package com.crio.qcalc;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;


public class StandardCalculatorTest {

    private StandardCalculator standardCalculator;


    @BeforeEach

    void setup(){

        standardCalculator = new StandardCalculator();

    }


    @Test

    @DisplayName("Test Addition of Two Doubles")

    void testAdditionOperation(){

        standardCalculator.add(1.0,1.5);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(2.5, actualResult);

    }


    @Test

    @DisplayName("Test Subtraction of Two Doubles")

    void testSubtractionOperation(){

        standardCalculator.subtract(10.0,20.5);

        double actualResult = standardCalculator.getResult();

        Assertions.assertEquals(-10.5, actualResult);

    }
    @Test

@DisplayName("Test Division of Two double")

void testDivisionOperation(){

    standardCalculator.divide(6.0,2.0);

    double actualResult = standardCalculator.getResult();

    Assertions.assertEquals(3.0, actualResult);

}


@Test

@DisplayName("Test Multiplication of Two double")

void testMultiplicationOperation(){

    standardCalculator.multiply(2.0,1.0);

    double actualResult = standardCalculator.getResult();

    Assertions.assertEquals(2.0, actualResult);

}


}

