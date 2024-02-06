package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessor {

    public List<Integer> filterAndDouble(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n % 2 != 0 ? n * 2 : n) // filter and double each odd number
                .collect(Collectors.toList());
    }
}

