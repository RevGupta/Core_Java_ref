package lambdas;

import lambdas.mathop.MathOperationImplementation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MathOperationTest {

    // Lambda expression for addition
    private MathOperationImplementation mathOperationImplementation;

    @BeforeEach
    public void setUp() {
        mathOperationImplementation = new MathOperationImplementation();
    }

    // Test case for addition
    @Test
    public void testAddition() {
        assertEquals(5, mathOperationImplementation.addition.operate(2, 3));
        assertEquals(-1, mathOperationImplementation.addition.operate(-5, 4));
        assertEquals(0, mathOperationImplementation.addition.operate(0, 0));
    }

}
