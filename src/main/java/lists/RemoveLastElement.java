package lists;

import java.util.ArrayList;

public class RemoveLastElement {
    public static void main(String[] args) {
        ArrayList<String> itemList = new ArrayList<>();
        itemList.add("Hyderabad");
        itemList.add("Goa");
        itemList.add("Mumbai");
        itemList.add("Delhi");

        System.out.println("List before removal: " + itemList);

        if (!itemList.isEmpty()) {
            removeLastElement(itemList);
            System.out.println("Removed the last element.");
        } else {
            System.out.println("List is empty. No elements to remove.");
        }

        System.out.println("List after removal: " + itemList);
    }

    private static void removeLastElement(ArrayList<String> list) {
        list.remove(list.size() - 1);
    }
}

