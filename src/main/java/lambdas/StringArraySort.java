package lambdas;

import java.util.Arrays;

public class StringArraySort {
    public static String[] ArraySort(String[] input) {
        // Create a copy of the input array
        String[] sortedArray = Arrays.copyOf(input, input.length);

        // Sorting based on length in ascending order, then by last character in descending order
        Arrays.sort(sortedArray, (s1, s2) ->
                s1.length() != s2.length() ? s1.length() - s2.length() : s2.charAt(s2.length() - 1) - s1.charAt(s1.length() - 1));

        // Print the sorted array
        Arrays.stream(sortedArray).forEach(System.out::println);

        // Return the sorted array
        return sortedArray;
    }
}


