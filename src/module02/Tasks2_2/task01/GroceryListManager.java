package module02.Tasks2_2.task01;

import java.util.ArrayList;

public class GroceryListManager {
    ArrayList<String> groceryList = new ArrayList<>();

    //Methods
    public void addItem(String item) {
        if (checkItem(item))
            System.out.println("Item " + item + " is already in the list");
        else
            groceryList.add(item);
    }

    public void removeItem(String item) {
        if (checkItem(item)) {
        System.out.println("Removing " + item + " from the list...");
        groceryList.remove(item);
        }
        else
            System.out.println("Item " + item + " is not in the list");
    }

    public void displayList() {
        System.out.println("Grocery list:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i+1 + ". " + groceryList.get(i));
        }
    }

    public boolean checkItem(String item){
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItem("Apples");
        groceryListManager.addItem("Milk");
        groceryListManager.addItem("Bread");
        groceryListManager.displayList();
        System.out.println();
        System.out.println("Let's check if Milk is in the list " + groceryListManager.checkItem("Milk"));
        System.out.println();
        groceryListManager.removeItem("Milk");
        System.out.println();
        groceryListManager.displayList();
    }
}
