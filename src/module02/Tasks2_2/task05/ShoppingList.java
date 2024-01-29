package module02.Tasks2_2.task05;

import java.util.HashMap;

public class ShoppingList {
    HashMap<String, String> shoppingList = new HashMap<>();

    public void addItem(String item, String purpose){
        if (shoppingList.containsKey(item))
            System.out.println("Item " + item + " is already in the list");
        else
            shoppingList.put(item, purpose);
    }

    public void removeItem(String item){
        if (shoppingList.containsKey(item)){
            System.out.println("Removing " + item + " from the list...");
            shoppingList.remove(item);
        }
        else
            System.out.println("Item " + item + " is not in the list");
    }

    public void displayList(){
        System.out.println("Shopping list:");
        for (String item : shoppingList.keySet()){
            System.out.println(item + " - " + shoppingList.get(item));
        }
    }
}
