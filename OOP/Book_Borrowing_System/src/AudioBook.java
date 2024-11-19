public class AudioBook extends Book {
    // Private field to store the runtime of the audiobook in minutes
    private int runTime;

    // Constructor for the AudioBook class, which initializes its properties and those of the parent class
    AudioBook(String title, String author, int pageCount, int runTime) {
        // Call the parent class (Book) constructor to initialize title, author, and pageCount
        super(title, author, 0);
        // Initialize the runtime specific to the AudioBook class
        this.runTime = runTime;
    }
}
