import java.time.LocalDate;  // Class for representing dates without time information
import java.time.Period; // Class for calculating the difference between two dates
import java.util.ArrayList; // Class representing a resizable array, used for managing collections of objects

// Define a class called `User`
public class User {
    /*
    The `name` and `birthDay` properties are declared as `private`,
    meaning their values cannot be accessed or modified directly
    from outside the `User` class.
    */
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>(); // List to store the books borrowed by the user

    // Constructor method to initialize a `User` with a name and a birthdate
    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay); // Convert the birthdate string into a LocalDate object
    }

    // Method to get the user's name
    public String getName() {
        return this.name;
    }

    // Method to get the user's birthday as a string
    public String getBirthday() {
        return this.birthDay.toString();
    }

    // Method to get a string representation of the books borrowed by the user
    public String borrowedBooks() {
        return this.books.toString();
    }

    // Method to allow the user to borrow a book by adding it to the `books` list
    public void borrow(Book book) {
        this.books.add(book);
    }

    // Method to calculate the current age of the user based on their birthdate
    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }
}
