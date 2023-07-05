
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator=new Calculator();
    }

    @Test
    @DisplayName("This is the addition Assertion")
    public void testAdd(){
        assertEquals(4,calculator.add(3,1),"ADDITION TEST01");
    }

    @Test
    @DisplayName("This is the multiplication Assertion")
    public void testMultiply(){
        assertEquals(12,calculator.multiply(12,1),"Multiplication Test02");
    }
}
