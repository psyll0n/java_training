public class Main {
    public static void main(String[] args) {
        int number = 5;
        int multiplier = 1;

        // A simple WHILE loop example that prints out multiplication table
        while (multiplier <= 10) {
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
            multiplier++;
        }

        /*
        A DO - WHILE loop can be used instead to perform the same task.
        However, in this type of loop, the main body gets executed first, before the condition logic is
        checked. This is the reason why the loop ends only AFTER the value of `multiplier` is set to 11.
        */
        do {
            System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
        } while (multiplier <= 10);
    }
}