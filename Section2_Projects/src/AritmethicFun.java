// Use shortcut 'psvm' to create a main function.
public class AritmethicFun {
    public static void main(String[] args) {
        // '+' Addition operator
        // '-' Subtraction operator
        // '*' Multiplication operator
        // '/' Division operator
        // '%' Modulus operator

        /* Compound operators (shorthand for execution
           of the arithmetic operations listed above).

           '+=' ; '-=' ; '*=' ; '/=' ; '%='

        */

        int a = 10;
        int b = 15;

        // e.g Binary Operators
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        // Use shortcut 'sout' for System.out.println()
        System.out.println("The result is " + result);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        System.out.println("The quotient is " + quotient);
        System.out.println("The remainder is " + remainder);

        result += 20;  // same as result = result + 20
        System.out.println("The result is now " + result);

        product *= 2;
        System.out.println("The product is now " + product);

        // UNARY operators
        result++;  // ++result;
        System.out.println("The result++ " + result);

        result--;  // --result;
        System.out.println("The result-- " + result);
    }
}



