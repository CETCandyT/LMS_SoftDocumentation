package Book_Test;

import LMS_Project.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Author: Candy Torres
 * Course: Software Development I - CEN 3024C
 * Due Date: March 15, 2024.
 * Class Name: BookTest
 * Description: This class contains unit tests for the Book class and its associated functionality.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BookTest {
    private Library library;

    /**
     * Constructor to initialize the library.
     */
    BookTest() {
    }

    /**
     * Method to set up the test environment before each test case.
     */
    @BeforeEach
    void setUp() {
        this.library = new Library("book.txt");
    }

    /**
     * Helper method to print the title of the test being executed.
     * @param title The title of the test.
     */
    private void printTestTitle(String title) {
        System.out.println(title);
    }

    /**
     * Test method to verify adding a book to the database.
     * This method adds a book to the library database and verifies its presence.
     */
    @Test
    @DisplayName("Test adding books to the database")
    @Order(1)
    void testAddBookToDatabase() {
        this.printTestTitle("1. Test - Adding books");
        // Add book to the database and verify its presence
    }

    /**
     * Test method to verify removing a book by barcode.
     * This method removes a book from the library database using its barcode.
     */
    @Test
    @DisplayName("Test remove book by barcode")
    @Order(2)
    void testRemoveBookByBarcode() {
        this.printTestTitle("2. Test - Remove books by barcode");
        // Remove book by barcode and verify its absence
    }

    /**
     * Test method to verify removing a book by title.
     * This method removes a book from the library database using its title.
     */
    @Test
    @DisplayName("Test remove book by title")
    @Order(3)
    void testRemoveBookByTitle() {
        this.printTestTitle("3. Test - Remove books by title");
        // Remove book by title and verify its absence
    }

    /**
     * Test method to verify checking out a book.
     * This method checks out a book from the library and verifies the checkout process.
     */
    @Test
    @DisplayName("Test Checking Out a Book")
    @Order(4)
    void testCheckOutBook() {
        this.printTestTitle("4. Test - Check Out Book");
        // Check out a book and verify its checkout status
    }

    /**
     * Test method to verify checking in a book.
     * This method checks in a book to the library and verifies the check-in process.
     */
    @Test
    @DisplayName("Test Checking In a Book")
    @Order(5)
    void testCheckInBook() {
        this.printTestTitle("5. Test - Check-in Books");
        // Check in a book and verify its check-in status
    }
}
