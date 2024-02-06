package lambdas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFilterTest {

    @Test
    public void testFilterStrings() {
        List<String> inputList = Arrays.asList("Apple", "Banana", "Orange", "Avocado", "Grapes");

        // Test case 1: Filter strings starting with "A"
        List<String> result1 = StringFilter.filterStrings(inputList, s -> s.startsWith("A"));
        assertEquals(Arrays.asList("Apple", "Avocado"), result1);

        // Test case 2: Filter strings starting with "B"
        List<String> result2 = StringFilter.filterStrings(inputList, s -> s.startsWith("B"));
        assertEquals(Arrays.asList("Banana"), result2);

        // Test case 3: Filter strings starting with "C"
        List<String> result3 = StringFilter.filterStrings(inputList, s -> s.startsWith("C"));
        assertEquals(Arrays.asList(), result3);
    }
}
