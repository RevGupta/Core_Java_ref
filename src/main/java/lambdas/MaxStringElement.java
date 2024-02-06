package lambdas;

import java.util.List;
import java.util.Optional;

public class MaxStringElement {

    public String findMaxElement(List<String> strings) {
        Optional<String> maxElement = strings.stream()
                .max(String::compareTo);  // natural order comparison

        return maxElement.orElse(null);
    }
}
