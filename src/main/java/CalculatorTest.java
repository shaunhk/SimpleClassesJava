import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator();}

    @Test
    public void canADD(){
        assertEquals(3.75, calculator.add(1.51, 2.24), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(2.11, calculator.subtract(5.25,3.14), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(7.50, calculator.multiply(2.5, 3.00), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(2.50, calculator.divide(7.5, 3), 0.01);
    }
}