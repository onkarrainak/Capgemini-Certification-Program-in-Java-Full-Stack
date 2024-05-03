package onkar.Core_Java_LibraryManagingSystem;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("Clouds and Waves", "Rabindranath Tagore");
        Book book2 = new Book("The Richest Man in Babylon", "George S. Calson");
        Book book3 = new Book("Do Epic Shit", "Ankur Warikoo");

        // Create a library
        Library library = new Library();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create a member
        Member member1 = new Member("Onkar Rainak");

        // Member borrows a book
        member1.borrowBook(book1, new String());
        member1.borrowBook(book2, new String());

        // Member try to borrow the same book again
        member1.borrowBook(book1, new String());

        // Member returns a book
        member1.returnBook(book2);
        
        member1.borrowBook(book2, new String());
    }
}
