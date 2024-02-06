package additional;

import java.util.HashMap;
import java.util.Map;

public class GetUniqueWordCount {

    public static int GetUniqueCount(String inputString) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        if (inputString.equals(""))
            return 0;

        // Remove punctuation marks and split the string
        String[] words = inputString.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        int uniqueWordCount = wordCountMap.size();
        // System.out.println("Number of unique words: " + uniqueWordCount);
        return uniqueWordCount;
    }

//    public static void main(String[] args) {
//        String inputString = "This is a sample sentence, with some punctuation marks. This sentence is a sample.";
//        int result = getUniqueCount(inputString);
//        System.out.println("Number of unique words: " + result);
//    }
}

