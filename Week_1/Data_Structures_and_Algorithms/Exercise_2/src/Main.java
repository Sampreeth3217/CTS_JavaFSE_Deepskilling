public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Shoes", "Footwear"),
            new Product("P103", "Smartphone", "Electronics"),
            new Product("P104", "Watch", "Accessories"),
            new Product("P105", "Backpack", "Bags")
        };

        System.out.println("=== Linear Search ===");
        Product found1 = SearchService.linearSearch(products, "Watch");
        System.out.println(found1 != null ? found1 : "Product not found.");

        System.out.println("\n=== Binary Search ===");
        SearchService.sortByName(products);  // Binary search requires sorted array
        Product found2 = SearchService.binarySearch(products, "Watch");
        System.out.println(found2 != null ? found2 : "Product not found.");
    }
}
