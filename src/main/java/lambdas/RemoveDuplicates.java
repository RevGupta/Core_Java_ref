package lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()  // removes duplicates
                .collect(Collectors.toList());
    }
}
