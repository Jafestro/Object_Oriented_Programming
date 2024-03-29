package module02.Tasks2_2.task03;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {
    HashMap<String, Double> groceryList = new HashMap<>();
    HashMap<String, ArrayList<String>> groceryListWithCategory = new HashMap<>();

    //Methods
    public void addItem(String item, double cost) {
        if (checkItem(item))
            System.out.println("Item " + item + " is already in the list");
        else
            groceryList.put(item, cost);
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
        for (String item : groceryList.keySet()) {
            System.out.println(item + " - " + groceryList.get(item));
        }
    }

    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }


    //Task2 Total Cost Calculation
    public double totalCost(){
        double totalCost = 0;
        for (double cost : groceryList.values()){
            totalCost += cost;
        }
        return totalCost;
    }

    //Task3 Grocery List with Categories
    public void addItemWithCategory(String item, String category){
        if (checkItem(item))
            System.out.println("Item " + item + " is already in the list");
        else {
            groceryList.put(category, 0.0);
            ArrayList<String> items;
            if (groceryListWithCategory.containsKey(category)){
                items = groceryListWithCategory.get(category);
            }
            else {
                items = new ArrayList<>();
            }
            items.add(item);
            groceryListWithCategory.put(category, items);
        }
    }

    public void displayByCategory(String category){
        System.out.println("Grocery list:");
        ArrayList<String> items = groceryListWithCategory.get(category);
        int i = 1;
        for (String item : items){
            System.out.println(i + ". " + item);
            i++;
        }
    }

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItemWithCategory("Apple", "Fruits");
        groceryListManager.addItemWithCategory("Pear", "Fruits");
        groceryListManager.addItemWithCategory("Mango", "Fruits");
        groceryListManager.addItemWithCategory("Milk", "Dairy");
        groceryListManager.addItemWithCategory("Bread", "Bakery");
        groceryListManager.displayByCategory("Bakery");
    }
}


