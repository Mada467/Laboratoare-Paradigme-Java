package Laborator7Paradigme;

import Laborator6Paradigme.Problema2.NewIntCalculator;
import org.junit.jupiter.api.*;

public class NewIntCalculatorTest {

    private NewIntCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new NewIntCalculator(0);
    }

    @Test
    public void testAddPositive() {
        // arrange
        int value = 10;
        // act
        calculator.add(value);
        // assert
        Assertions.assertEquals(10, calculator.result());
    }

    @Test
    public void testAddNegatives() {
        // arrange
        int value = -5;
        // act
        calculator.add(value);
        // assert
        Assertions.assertEquals(-5, calculator.result());
    }

    @Test
    public void testSubtractPositives() {
        // arrange
        calculator = new NewIntCalculator(10);
        int value = 3;
        // act
        calculator.subtract(value);
        // assert
        Assertions.assertEquals(7, calculator.result());
    }

    @Test
    public void testSubtractNegatives() {
        // arrange
        calculator = new NewIntCalculator(5);
        int value = -2;
        // act
        calculator.subtract(value);
        // assert
        Assertions.assertEquals(7, calculator.result());
    }

    @Test
    public void testMultiplyPositives() {
        // arrange
        calculator = new NewIntCalculator(4);
        int value = 5;
        // act
        calculator.multiply(value);
        // assert
        Assertions.assertEquals(20, calculator.result());
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}
