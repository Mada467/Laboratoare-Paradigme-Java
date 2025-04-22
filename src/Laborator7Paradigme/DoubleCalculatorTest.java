package Laborator7Paradigme;

import Laborator6Paradigme.Problema2.DoubleCalculator;
import Laborator6Paradigme.Problema2.NewIntCalculator;
import org.junit.jupiter.api.*;

public class DoubleCalculatorTest {

    private DoubleCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new DoubleCalculator(0);
    }

    @Test
    public void testAddPositive() {
        // arrange
        int value = 10;
        // act
        calculator.add(value);
        // assert
        Assertions.assertEquals(10.0, calculator.result());
    }

    @Test
    public void testAddNegatives() {
        // arrange
        int value = -5;
        // act
        calculator.add(value);
        // assert
        Assertions.assertEquals(-5.0, calculator.result());
    }

    @Test
    public void testSubtractPositives() {
        // arrange
        calculator = new DoubleCalculator(10);
        int value = 3;
        // act
        calculator.subtract(value);
        // assert
        Assertions.assertEquals(7.0, calculator.result());
    }

    @Test
    public void testSubtractNegatives() {
        // arrange
        calculator = new DoubleCalculator(5);
        int value = -2;
        // act
        calculator.subtract(value);
        // assert
        Assertions.assertEquals(7.0, calculator.result());
    }

    @Test
    public void testMultiplyPositives() {
        // arrange
        calculator = new DoubleCalculator(4);
        int value = 5;
        // act
        calculator.multiply(value);
        // assert
        Assertions.assertEquals(20.0, calculator.result());
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}
