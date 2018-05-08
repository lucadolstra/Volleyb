package nl.capgemini.volleyball.controller;

import nl.capgemini.volleyball.utils.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @InjectMocks                                        //make clear it's a mock
    private CalculatorController calculatorController;

    @Mock
    private Calculator calculator;

    @Test
    public void testAdd() {

        Mockito.when(this.calculator.add(3, 4)).thenReturn(7);
        //mockito creates a new implementation
        //of Calculator interface, without it having had to be implemented yet.
        // So you're only testing the Controller.

        Assert.assertEquals(7, this.calculatorController.add(3, 4));
        Mockito.verify(this.calculator).add(3, 4);
        //tests whether the calculator in the controller is really invoking the add method with these parameters
    }

    @Test
    public void testSubtract() {
        Mockito.when(this.calculator.subtract(2, 1)).thenReturn(1);
        Assert.assertEquals(1, this.calculatorController.subtract(2, 1));
        Mockito.verify(this.calculator, times(1)).subtract(2, 1);
    }

    @Test
    public void testMultiply() {
        Mockito.when(this.calculator.multiply(2, 3)).thenReturn(6);
        Assert.assertEquals(6, this.calculatorController.multiply(2, 3));
        Mockito.verify(this.calculator).multiply(2, 3);
    }

    @Test
    public void testWholeDivide() {
        Mockito.when(this.calculator.wholeDivide(8, 4)).thenReturn(2);
        Assert.assertEquals(2, this.calculatorController.wholeDevide(8, 4));
        Mockito.verify(this.calculator).wholeDivide(8, 4);
    }

}
