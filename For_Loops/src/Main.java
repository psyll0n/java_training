import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            Every FOR loop usually has four parts:
                1. Initializer
                2. Condition
                3. Loop Body
                4. Update
        */
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
        // It is also possible to iterate over the values in an array
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
            System.out.println(numbers[index]);
        }
        System.out.println(sum);

        /*
         The loop below is an abbreviated version of a FOR loop that iterates over the `numbers` array.
         Note that the type of the values in the array should match the type of the initializer...
        */
        int total_sum = 0;
        for (int number : numbers) {
            total_sum += number;
            System.out.println(number);
        }
        System.out.println(total_sum);

        // The FOR loop below prints out a multiplication table
        int random_int = 5;
        for (int multiplier = 1; multiplier < 10; multiplier++) {
            System.out.printf("%d X %d = %d \n", random_int, multiplier, random_int * multiplier);
        }

        // Nested FOR loop example
        for (int number = 1; number < 10; number++) {
            // The variables declared in the inner FOR loop are not accessible to the outer FOR loop
            for (int multiplier = 1; multiplier < 10; multiplier++) {
                // The `.printf` method does not include a new line character while the `.printl` does
                System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
            }
        }

        // The loop below prints out all odd numbers between 1 and 50
        for (int number = 1; number <= 50; number++) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }

        /*
        Additionally, a FOR EACH loop can be used with ArrayLists to perform a certain operation
        by using each of the values it holds. Note that the original ArrayList is NOT modified!
        */
        ArrayList<Integer> numbersArray = new ArrayList<Integer>();

        numbersArray.add(23); // Stored at Index 0
        numbersArray.add(46); // Stored at Index 1
        numbersArray.add(12); // Stored at Index 2

        numbersArray.forEach(number -> {
            System.out.println(number * 2);
        });

        System.out.println("Before: " + numbersArray.toString());

        /*
         In the code below, each of the values stored in the `numbersArray` ArrayList gets multiplied by 2,
         and then the result is used to replace each original value ...
        */
        numbersArray.forEach(number -> {
            numbersArray.set(numbersArray.indexOf(number), number * 2);
        });
        System.out.println("After: " + numbersArray.toString());
    }
}