package exceptions;

public class StringToIntConverter {

    public int convertString(String input) {
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException("Not an integer");
        }
    }
}