public class Ebook extends Book {
    // Private field to store the runtime of the audiobook in minutes
    private String format;

    // Constructor for the Ebook class, which initializes its properties and those of the parent class
    Ebook(String title, String author, int pageCount, String format) {
        // Call the parent class (Book) constructor to initialize title, author, and pageCount
        super(title, author, pageCount);
        // Initialize the format property specific to the Ebook class
        this.format = format;
    }
}
