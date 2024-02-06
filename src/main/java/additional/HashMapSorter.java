package additional;

import java.util.Map;
import java.util.*;

public class HashMapSorter {

    public static void sortHashMap(HashMap<Integer, String> hashMap) {
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(hashMap.entrySet());

        // Sort the list based on the key (Integer in this case, modify comparator accordingly)
        Collections.sort(entryList, Comparator.comparing(Map.Entry::getKey));

        // Create a new LinkedHashMap to maintain the order of elements
        HashMap<Integer, String> sortedHashMap = new LinkedHashMap<>();

        // Populate the sortedHashMap with sorted entries
        for (Map.Entry<Integer, String> entry : entryList) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sortedHashMap or perform further actions
        System.out.println("Sorted HashMap: " + sortedHashMap);
    }
}

