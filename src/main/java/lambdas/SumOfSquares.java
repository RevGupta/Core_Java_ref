package lambdas;

import java.util.List;

public class SumOfSquares {
    public int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 0)              // filter out non-positive integers
                .mapToInt(n -> n * n)            // square each positive integer
                .sum();                          // calculate the sum
    }
}
