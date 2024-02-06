package lambdas;

import java.util.Arrays;

public class AvgOfSquaresOfOddNumbers {

    public static double AvgofSqofOdd(int[] numbers) {
        double result = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .mapToDouble(n -> n * n) // Square each odd number
                .average() // Calculate the average
                .orElse(0); // Default value if no elements are present

        return result;
    }
}

