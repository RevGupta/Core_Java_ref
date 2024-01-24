package lists;

import java.util.ArrayList;

public class ArrayListTraversal {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hyderabad");
        strList.add("Bangalore");
        strList.add("Mumbai");
        strList.add("Delhi");


        System.out.println("Traversing using regular for loop:");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }


        System.out.println("\nTraversing using enhanced for loop:");
        for (String state : strList) {
            System.out.println(state);
        }
    }
}

