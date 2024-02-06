package lambdas;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates duplicateRemover = new RemoveDuplicates();

        // Test case 1: General case with duplicates
        List<Integer> input1 = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1);
        List<Integer> result1 = duplicateRemover.removeDuplicates(input1);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), result1);

        // Test case 2: Empty list
        List<Integer> input2 = Arrays.asList();
        List<Integer> result2 = duplicateRemover.removeDuplicates(input2);
        assertEquals(Arrays.asList(), result2);

        // Test case 3: List with no duplicates
        List<Integer> input3 = Arrays.asList(7, 8, 9, 10);
        List<Integer> result3 = duplicateRemover.removeDuplicates(input3);
        assertEquals(Arrays.asList(7, 8, 9, 10), result3);

        // Test case 4: List with all duplicates
        List<Integer> input4 = Arrays.asList(5, 5, 5, 5);
        List<Integer> result4 = duplicateRemover.removeDuplicates(input4);
        assertEquals(Arrays.asList(5), result4);
    }
}
