package com.dsa.handson.three.solution;

public class Solution {

        public void addBook(String isbn, String title) {
        }

        public void deleteBook(String isbn) {
        }

        public String findBookByISBN(String isbn) {
            return "";
        }

        public void displayCatalog() {
            System.out.println("Library Catalog (Sorted by ISBN):");

        }

        public static void main(String[] args) {
            Solution catalog = new Solution();

            // Adding books
            catalog.addBook("978-0061120084", "To Kill a Mockingbird");
            catalog.addBook("978-0451524935", "1984");
            catalog.addBook("978-0141187761", "Brave New World");

            // Displaying the catalog (sorted by ISBN)
            catalog.displayCatalog();

            // Finding a book by ISBN
            String bookTitle = catalog.findBookByISBN("978-0451524935");
            System.out.println("Book Found: " + bookTitle);

            // Deleting a book
            catalog.deleteBook("978-0451524935");

            // Displaying the updated catalog (sorted by ISBN)
            catalog.displayCatalog();
        }


}
