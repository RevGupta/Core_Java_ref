package additional;

public class StringRotation {
    public boolean isRotation(String str1, String str2) {
        // Check if the lengths are equal and not zero
        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenatedStr = str1 + str1;

        // Check if the second string is a substring of the concatenated string
        return concatenatedStr.contains(str2);
    }
}
