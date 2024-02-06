package lambdas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringArraySortTest {

    @Test
    public void testArraySort() {
        String[] inputArray = {"apple", "banana", "cherry", "date", "fig", "grape"};
        String[] expectedArray = {"fig", "date", "apple", "grape", "cherry", "banana" };

        String[] sortedArray = StringArraySort.ArraySort(inputArray);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testArraySortWithEmptyArray() {
        String[] inputArray = {};
        String[] expectedArray = {};

        String[] sortedArray = StringArraySort.ArraySort(inputArray);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testArraySortWithEqualLengthStrings() {
        String[] inputArray = {"apple", "banana", "date", "fig", "grape"};
        String[] expectedArray = {"fig", "date", "apple", "grape", "banana"};

        String[] sortedArray = StringArraySort.ArraySort(inputArray);

        assertArrayEquals(expectedArray, sortedArray);
    }
}
