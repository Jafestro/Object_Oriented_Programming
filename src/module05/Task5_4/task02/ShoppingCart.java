package module05.Task5_4.task02;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }
    public void addItem(String name, double price) {
        products.add(new Product(name, price));
    }

    public void removeItem(String item) {
        Product product = products.stream()
                .filter(p -> p.getName().equals(item))
                .findFirst().get();
        products.remove(product);
    }

    public double calculateTotal() {
        double total = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
        total = Math.round(total * 100.0) / 100.0;
        return total;
    }
    public int getItemCount() {
        return products.size();
    }
}
