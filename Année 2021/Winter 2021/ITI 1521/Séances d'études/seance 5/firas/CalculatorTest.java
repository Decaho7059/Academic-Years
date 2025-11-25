import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        int x = 2;
        int y = 5;
        Calculator calculator = new Calculator();

        int result = calculator.add(x,y);

        assertEquals(7,result);
    }

}