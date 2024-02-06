package lambdas;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxStringElementTest {

    @Test
    public void testFindMaxElement() {
        MaxStringElement maxElementFinder = new MaxStringElement();

        // Test case 1: General case
        List<String> input1 = Arrays.asList("apple", "banana", "orange", "grape");
        String result1 = maxElementFinder.findMaxElement(input1);
        assertEquals("orange", result1);

        // Test case 2: Empty list
        List<String> input2 = Arrays.asList();
        String result2 = maxElementFinder.findMaxElement(input2);
        assertEquals(null, result2);

        // Test case 3: List with one element
        List<String> input3 = Arrays.asList("apple");
        String result3 = maxElementFinder.findMaxElement(input3);
        assertEquals("apple", result3);

        // Test case 4: List with multiple elements, including empty string
        List<String> input4 = Arrays.asList("dog", "cat", "", "elephant");
        String result4 = maxElementFinder.findMaxElement(input4);
        assertEquals("elephant", result4);
    }
}
