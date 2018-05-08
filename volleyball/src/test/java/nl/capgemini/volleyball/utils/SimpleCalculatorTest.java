package nl.capgemini.volleyball.utils;

import org.junit.After;
import org.junit.Assert;                           //org.junit.Assert needs to be implemented for Assert
import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();   //instantiates a calculator every time a tests runs
    }


    @Test
    public void testAdd() {
        int actual = this.calculator.add(3, 4);
        int expected = 7;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int actual = this.calculator.subtract(7, 5);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultitply() {
        int actual = this.calculator.multiply(2, 4);
        int expected = 8;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testWholeDivide() {
        int actual = this.calculator.wholeDivide(8, 2);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        this.calculator = null;                     //throws away the calculator after test
    }

}
