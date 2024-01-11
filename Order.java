// Order.java

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in order:");
        for (Product product : products) {
            product.display();
        }
    }
}
