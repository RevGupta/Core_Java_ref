package lambdas;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfSquaresTest {

    @Test
    public void testSumOfSquares() {
        SumOfSquares sumCalculator = new SumOfSquares();

        // Test case 1: General case
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        int result1 = sumCalculator.sumOfSquares(input1);
        assertEquals(55, result1);

        // Test case 2: Empty list
        List<Integer> input2 = Arrays.asList();
        int result2 = sumCalculator.sumOfSquares(input2);
        assertEquals(0, result2);

        // Test case 3: List with negative numbers
        List<Integer> input3 = Arrays.asList(-1, -2, -3, -4, -5);
        int result3 = sumCalculator.sumOfSquares(input3);
        assertEquals(0, result3);

        // Test case 4: List with only zero
        List<Integer> input4 = Arrays.asList(0);
        int result4 = sumCalculator.sumOfSquares(input4);
        assertEquals(0, result4);
    }
}
