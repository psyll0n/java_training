public class Book {
    private String title;  // Field to store the title of the book
    private String author; // Field to store the author of the book
    private int pageCount;

    // Constructor to initialize a `Book` object with a title and an author
    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Method to get the value of the `title` field
    public String getTitle() {
        return this.title;
    }

    // Method to get the value of the `author` field
    public String getAuthor() {
        return this.author;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    /*
     Overrides the `toString` method to provide a string representation
     of a `Book` object in the format: "Author by Title".
    */
    @Override
    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}
