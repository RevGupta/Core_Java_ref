package lambdas;

import java.util.Arrays;

public class StringsWithVowels {
    public static String[] getStringsWithVowels(String[] strings) {
        String[] result = Arrays.stream(strings)
                .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                .map(s -> "String: " + s + ", Vowels count: " + countVowels(s))
                .toArray(String[]::new);

        // Print the modified strings
        Arrays.stream(result).forEach(System.out::println);
        return result;
    }

    private static long countVowels(String s) {
        return s.chars().filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
    }
}


