public class Main {
    public static void main(String[] args) {
        Order[] orders = new Order[] {
            new Order("O101", "Alice", 2999.0),
            new Order("O102", "Bob", 15999.0),
            new Order("O103", "Charlie", 7999.0),
            new Order("O104", "David", 499.0),
            new Order("O105", "Eva", 10999.0)
        };

        System.out.println("Original Orders:");
        OrderSorter.printOrders(orders);

        // Bubble Sort
        Order[] bubbleSortedOrders = orders.clone();
        OrderSorter.bubbleSort(bubbleSortedOrders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        OrderSorter.printOrders(bubbleSortedOrders);

        // Quick Sort
        Order[] quickSortedOrders = orders.clone();
        OrderSorter.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        OrderSorter.printOrders(quickSortedOrders);
    }
}
