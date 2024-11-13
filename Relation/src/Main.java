public class Main {
    public static void main(String[] args) {
        int number1 = 12;
        int number2 = 15;

        // is equal to ..
        System.out.println(number1 == number2); // false

        // is not equal to ...
        System.out.println(number1 != number2); // true

        // is greater than ...
        System.out.println(number1 > number2); // false

        // is less than ...
        System.out.println(number1 < number2); // true

        // is greater than or equal to ...
        System.out.println(number1 >= number2); // false

        // is less than or equal to ...
        System.out.println(number1 <= number2); // true

        int age = 25;

        // age >= 18
        // age <= 40

        // Use of the logical AND operator ...
        System.out.println(age >= 18 && age <= 40); // true

        boolean isStudent = false;
        boolean isLibraryMember = true;

        // Use of logical OR operator ...
        System.out.println(isStudent || isLibraryMember); // true

        // Use of logical NOT operator ...
        System.out.println(!isStudent); // true

        int score = 0;
        int turns = 10;
        int number = 55;

        // Increment / Decrement the values of the variables `score` and `turns`
        score++;
        turns--;

        System.out.println(score);
        System.out.println(turns);

        /* The value of number gets printed first before it gets incremented
           due to how the compiler works.
        */
        System.out.println(number++);
        System.out.println(number);

        // The value of number gets incremented before compilation ...
        System.out.println(++number);
        System.out.println(number);

        // The value of number gets decremented before compilation ...
        System.out.println(--number);
        System.out.println(number);
    }
}