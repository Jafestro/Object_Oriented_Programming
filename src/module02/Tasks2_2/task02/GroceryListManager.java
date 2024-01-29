package module02.Tasks2_2.task02;

import java.util.HashMap;

public class GroceryListManager {
    HashMap<String, Double> groceryList = new HashMap<>();

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


    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItem("Apples", 1.5);
        groceryListManager.addItem("Milk", 2.5);
        groceryListManager.addItem("Bread", 1.0);
        groceryListManager.displayList();
        System.out.println();
        System.out.println("Let's check if Milk is in the list " + groceryListManager.checkItem("Milk"));
        System.out.println();
        groceryListManager.removeItem("Milk");
        System.out.println();
        groceryListManager.displayList();
        System.out.println();
        System.out.println("Total cost is " + groceryListManager.totalCost());
    }
}

