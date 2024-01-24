package lists;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hyberabad");
        stringList.add("Goa");
        stringList.add("Bangalore");
        stringList.add("Delhi");

        // Convert ArrayList to Array
        String[] stringArray = convertArrayListToArray(stringList);

        // Print the resulting array
        System.out.println("Array after conversion:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }
    }

    private static String[] convertArrayListToArray(ArrayList<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}

