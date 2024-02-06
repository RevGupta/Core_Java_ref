package additional;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HashMapSorterTest {

    @Test
    void testSortHashMap() {
        // Arrange
        HashMap<Integer, String> unsortedHashMap = new HashMap<>();
        unsortedHashMap.put(3, "Three");
        unsortedHashMap.put(1, "One");
        unsortedHashMap.put(2, "Two");

        // Act
        HashMapSorter.sortHashMap(unsortedHashMap);

        // Assert
        // Note: You may need to update the expected output based on your specific case
        assertEquals("{1=One, 2=Two, 3=Three}", unsortedHashMap.toString());
    }

    @Test
    void testSortHashMapEmpty() {
        // Arrange
        HashMap<Integer, String> emptyHashMap = new HashMap<>();

        // Act
        HashMapSorter.sortHashMap(emptyHashMap);

        // Assert
        assertTrue(emptyHashMap.isEmpty());
    }

    @Test
    void testSortHashMapWithDuplicates() {
        // Arrange
        HashMap<Integer, String> unsortedHashMap = new HashMap<>();
        unsortedHashMap.put(3, "Three");
        unsortedHashMap.put(1, "One");
        unsortedHashMap.put(2, "Two");
        unsortedHashMap.put(1, "DuplicateOne");

        // Act
        HashMapSorter.sortHashMap(unsortedHashMap);

        // Assert
        // Note: You may need to update the expected output based on your specific case
        assertEquals("{1=DuplicateOne, 2=Two, 3=Three}", unsortedHashMap.toString());
    }

    // Add more test cases as needed

}

