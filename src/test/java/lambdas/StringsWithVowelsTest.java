package lambdas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringsWithVowelsTest {

    @Test
    public void test1() {
        // Test case 1: Basic test with an array containing strings with vowels
        String[] input1 = {"apple", "banana", "kiwi", "grape"};
        String[] expectedOutput1 = {"String: apple, Vowels count: 2", "String: banana, Vowels count: 3", "String: kiwi, Vowels count: 2", "String: grape, Vowels count: 2"};
        assertArrayEquals(expectedOutput1, StringsWithVowels.getStringsWithVowels(input1));
    }

    @Test
    public void test2() {
        // Test case 2: Test with an array containing strings without vowels
        String[] input2 = {"abc", "lmn", "rst"};
        String[] expectedOutput2 = {"String: abc, Vowels count: 1"};
        assertArrayEquals(expectedOutput2, StringsWithVowels.getStringsWithVowels(input2));
    }


    @Test
    public void test3() {
        // Test case 3: Test with an empty array
        String[] input3 = {};
        String[] expectedOutput3 = {};
        assertArrayEquals(expectedOutput3, StringsWithVowels.getStringsWithVowels(input3));
    }

    @Test
    public void test4() {
        // Test case 4: Test with an array containing strings with both uppercase and lowercase vowels
        String[] input4 = {"AaEeIiOoUu", "Orange", "grape"};
        String[] expectedOutput4 = {"String: AaEeIiOoUu, Vowels count: 10", "String: Orange, Vowels count: 3", "String: grape, Vowels count: 2"};
        assertArrayEquals(expectedOutput4, StringsWithVowels.getStringsWithVowels(input4));
    }
}
