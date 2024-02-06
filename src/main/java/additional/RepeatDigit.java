package additional;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatDigit {
    public ArrayList<Integer> getRepeatNum(Integer input) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        String inputString = input.toString();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (characterIntegerHashMap.containsKey(c)) {
                characterIntegerHashMap.put(c, characterIntegerHashMap.get(c) + 1);
            } else {
                characterIntegerHashMap.put(c, 1);
            }
        }

        for (char c : inputString.toCharArray()) {
            if (characterIntegerHashMap.get(c) > 1) {
                int numericValue = Character.getNumericValue(c);
                if (!integerArrayList.contains(numericValue)) {
                    integerArrayList.add(numericValue);
                }
            }
        }
        return integerArrayList;
    }
}



