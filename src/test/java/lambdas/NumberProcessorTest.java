package lambdas;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberProcessorTest {

    @Test
    public void testFilterAndDouble() {
        NumberProcessor processor = new NumberProcessor();

        // Test case 1: General case
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result1 = processor.filterAndDouble(input1);
        assertEquals(Arrays.asList(2, 2, 6, 4, 10), result1);

        // Test case 2: Empty list
        List<Integer> input2 = Arrays.asList();
        List<Integer> result2 = processor.filterAndDouble(input2);
        assertEquals(Arrays.asList(), result2);

        // Test case 3: All even numbers
        List<Integer> input3 = Arrays.asList(2, 4, 6, 8);
        List<Integer> result3 = processor.filterAndDouble(input3);
        assertEquals(Arrays.asList(2, 4, 6, 8), result3);

        // Test case 4: All odd numbers
        List<Integer> input4 = Arrays.asList(1, 3, 5, 7);
        List<Integer> result4 = processor.filterAndDouble(input4);
        assertEquals(Arrays.asList(2, 6, 10, 14), result4);
    }
}

