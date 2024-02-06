package lambdas;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupByLengthTest {

    @Test
    public void testGroupByLength() {
        GroupByLength lengthGrouper = new GroupByLength();

        // Test case 1: General case
        List<String> input1 = Arrays.asList("apple", "banana", "orange", "grape");
        Map<Integer, List<String>> result1 = lengthGrouper.groupByLength(input1);
        assertEquals(2, result1.size());
        assertEquals(Arrays.asList("grape"), result1.get(5));
        assertEquals(Arrays.asList("apple", "banana", "orange"), result1.get(6));

        // Test case 2: Empty list
        List<String> input2 = Arrays.asList();
        Map<Integer, List<String>> result2 = lengthGrouper.groupByLength(input2);
        assertEquals(0, result2.size());

        // Test case 3: List with one element
        List<String> input3 = Arrays.asList("apple");
        Map<Integer, List<String>> result3 = lengthGrouper.groupByLength(input3);
        assertEquals(1, result3.size());
        assertEquals(Arrays.asList("apple"), result3.get(5));

        // Test case 4: List with multiple elements, including empty string
        List<String> input4 = Arrays.asList("dog", "cat", "", "elephant");
        Map<Integer, List<String>> result4 = lengthGrouper.groupByLength(input4);
        assertEquals(3, result4.size());
        assertEquals(Arrays.asList(""), result4.get(0));
        assertEquals(Arrays.asList("dog", "cat"), result4.get(3));
        assertEquals(Arrays.asList("elephant"), result4.get(8));
    }
}
