import java.time.LocalDate; // Class for representing dates without time information

public class Main {
    public static void main(String[] args) {
        // Create a new `User` object named `olderUser` with a specified name and birth date
        User olderUser = new User("Alex Yakimov", "1979-07-17");
        // Print the name, birthdate, and current age of `olderUser`
        System.out.printf("%s was born back in %s and he currently is %d years old.\n",
                olderUser.getName(), olderUser.getBirthday(), olderUser.age());

        // Create another `User` object named `youngerUser` with a different name and birth date
        User youngerUser = new User("Alex Yakimov Jr.", "1999-05-26");
        // Print the name, birthdate, and current age of `youngerUser`
        System.out.printf("%s was born back in %s and he currently is %d years old.\n",
                youngerUser.getName(), youngerUser.getBirthday(), youngerUser.age());

        // Create a new `Book` object with a title and an author
        Book LordOfTheRings = new Book("Lord of the Rings", "J. R. R. Tolkien", 356);

        // Create a new `AudioBook` object
        AudioBook Dracula = new AudioBook("Dracula", "Bram Stoker", 0, 30000);

        // Create a new `Ebook` object
        Ebook Jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehous", 200, "PDF");

        // Print out the available books, audiobooks and ebooks
        System.out.println(LordOfTheRings.toString());
        System.out.println(Dracula.toString());
        System.out.println(Jeeves.toString());


        // Allow `olderUser` to borrow the created book
        olderUser.borrow(LordOfTheRings);

        // Print the list of books borrowed by `olderUser`
        System.out.printf("%s has borrowed these books: %s, %d pages\n", olderUser.getName(),
                olderUser.borrowedBooks(), LordOfTheRings.getPageCount());
    }
}
