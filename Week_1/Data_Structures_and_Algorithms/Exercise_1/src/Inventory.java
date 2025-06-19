import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> productMap;

    public Inventory() {
        productMap = new HashMap<>();
    }

    // Add a product
    public void addProduct(Product product) {
        if (!productMap.containsKey(product.getProductId())) {
            productMap.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product ID already exists.");
        }
    }

    // Update a product
    public void updateProduct(String productId, String newName, int newQuantity, double newPrice) {
        Product product = productMap.get(productId);
        if (product != null) {
            product.setProductName(newName);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (productMap.remove(productId) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display all products
    public void displayInventory() {
        if (productMap.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : productMap.values()) {
                System.out.println(product);
            }
        }
    }
}
