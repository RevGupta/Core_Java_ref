package lambdas;

import java.util.Arrays;

public class CapitalizeAndSort {
    public static String[] capitalizeAndSort(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .sorted()
                .toArray(String[]::new);
    }
}