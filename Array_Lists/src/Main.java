import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        /*
         As we already know the primitive types are:
            - int
            - double
            - float
            - boolean

          The `Integer` data type is a wrapper (reference form) for the primitive type `int`.
          Similarly, there are similar reference types for the Double, Float and Boolean data types.
          With ArrayLists the primitive types cannot be used, but the wrapper data types should be used instead.
        */
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Add a bunch of integers to the `numbers` ArrayList
        numbers.add(1); // Stored ad Index 0
        numbers.add(2); // Stored ad Index 1
        numbers.add(3); // Stored ad Index 2
        numbers.add(4); // Stored ad Index 3
        numbers.add(5); // Stored ad Index 4

        System.out.println(numbers.toString());

        /*
         To print a single value which is stored in the `numbers` ArrayList, use the `.get` method and
         specify the index of the value...
        */
        System.out.println(numbers.get(2));

        /*
        To remove a value from the numbers ArrayList, use the `.remove` method. This removes the value at
        index 2.
        */
        numbers.remove(2);
        System.out.println(numbers.toString());

        /*
        If you want to remove a certain value which is stored in the ArrayList not by index but by
        primitive type use the method below instead:
        */
        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers.toString());

        // To remove all values that are stored in an ArrayList use the `.clear` method
        numbers.clear();
        System.out.println(numbers.toString());

        numbers.add(23); // Stored at Index 0
        numbers.add(46); // Stored at Index 1
        numbers.add(12); // Stored at Index 2

        // To add / update a certain value at specific index of an ArrayList use the `.set` method.
        // Updates the value stored at Index 2 to 30
        numbers.set(2, Integer.valueOf(30));
        System.out.println(numbers.toString());

        /*
         To sort the values in an ArrayList, use the `.sort` method and combine it with the `Comparator` class.
        */
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());

        // Perform sorting in a reverse manner ...
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        // Other useful ArrayList methods are:
        //
        // `.size`
        System.out.println(numbers.size());
        //  `.contains`
        System.out.println(numbers.contains(Integer.valueOf(30))); // true
        // `.isEmpty`
        System.out.println(numbers.isEmpty()); // false
    }
}