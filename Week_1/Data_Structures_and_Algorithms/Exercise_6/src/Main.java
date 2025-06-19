public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[] {
            new Book("B101", "The Alchemist", "Paulo Coelho"),
            new Book("B102", "1984", "George Orwell"),
            new Book("B103", "Clean Code", "Robert C. Martin"),
            new Book("B104", "Brave New World", "Aldous Huxley"),
            new Book("B105", "To Kill a Mockingbird", "Harper Lee")
        };

        // Linear Search
        System.out.println("🔍 Linear Search for 'Clean Code':");
        Book foundLinear = LibrarySearch.linearSearch(books, "Clean Code");
        System.out.println(foundLinear != null ? foundLinear : "Book not found.");

        // Binary Search (requires sorted array)
        LibrarySearch.sortByTitle(books);
        System.out.println("\n🔍 Binary Search for 'Clean Code':");
        Book foundBinary = LibrarySearch.binarySearch(books, "Clean Code");
        System.out.println(foundBinary != null ? foundBinary : "Book not found.");
    }
}
