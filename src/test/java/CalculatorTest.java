import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void ninetyNineAddONeAmountWillBeOneHundred() {
        int expected = 100;
        int result = calculator.add(99, 1);
        assertEquals(expected, result);
    }

    @Test
    public void fiftyAddFiftyAmountWillBeOneHundred() {
        int expected = 100;
        int result = calculator.add(50, 50);
        assertEquals(expected, result);
    }

    @Test
    public void oneHundredSubtractFiftyWillBeOneFifty() {
        int expected = 50;
        int result = calculator.substract(100, 50);
        assertEquals(expected, result);
    }

    @Test
    public void oneHundredSubtractTwoWillBeOneNinetyEight() {
        int expected = 98;
        int result = calculator.substract(100, 2);
        assertEquals(expected, result);
    }

    @Test
    public void twoToThePowerOfTwo() {
        int expected = 4;
        int result = calculator.power(2, 2);
        assertEquals(expected, result);
    }

    @Test
    public void fourToThePowerOfThree() {
        int expected = 64;
        int result = calculator.power(4, 3);
        assertEquals(expected, result);
    }

    @Test
    public void twoMultipliedByFifty() {
        int expected = 100;
        int result = calculator.multiply(2, 50);
        assertEquals(expected, result);
    }


    @Test
    public void oneHundredDividedByTwoWillBeFifty() {
        double expected = 20;
        double result = calculator.divide(40, 2);
        assertEquals(expected, result, 001);
    }

    @Test
    public void fortyDividedByTwoWillBeTwenty() {
        double expected = 50;
        double result = calculator.divide(100, 2);
        assertEquals(expected, result, 001);
    }

    @Test
    public void fourMultipliedByTen() {
        int expected = 40;
        int result = calculator.multiply(4, 10);
        assertEquals(expected, result);
    }


    @Test(expected = NumberFormatException.class)
    public void inFunctionAddWhenInputIncorrectValueValueThenThrowException() {
        calculator.add(Integer.parseInt("4"), Integer.parseInt("sfd"));
    }

    @Test(expected = NumberFormatException.class)
    public void inFunctionSubstractWhenInputIncorrectValueValueThenThrowException() {
        calculator.substract(Integer.parseInt("4"), Integer.parseInt("sfd"));
    }

    @Test(expected = NumberFormatException.class)
    public void inFunctionMultiplyWhenInputIncorrectValueValueThenThrowException() {
        calculator.multiply(Integer.parseInt("4"), Integer.parseInt("sfd"));
    }

    @Test(expected = NumberFormatException.class)
    public void inFunctionPowerWhenInputIncorrectValueValueThenThrowException() {
        calculator.power(Integer.parseInt("sfd"), 2);
    }

    @Test(expected = NumberFormatException.class)
    public void inFunctionDivideWhenInputIncorrectValueValueThenThrowException() {
        calculator.divide(Double.parseDouble("sfd"), 2);
    }

    @Test(expected = ArithmeticException.class)
    public void dividingByZeroWillBeArithmeticException() {
        calculator.divide(50,0);
    }
}
