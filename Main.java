// Main.java

public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "Laptop", 1200.0);
        Product product2 = new Product(2, "Smartphone", 800.0);

        // Create an order
        Order order = new Order(101);

        // Add products to the order
        order.addProduct(product1);
        order.addProduct(product2);

        // Display order details
        order.display();
    }
}
