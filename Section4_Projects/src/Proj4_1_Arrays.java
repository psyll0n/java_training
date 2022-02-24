// Required to get user input
import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] someValues = new int[5];

        for (int i = 0; i < someValues.length; i++) {
            System.out.print("Enter an integer: \t");
            someValues[i] = keyboard.nextInt();
        } // end for

        for (int someValue : someValues) {
            System.out.println("The result is: " + (someValue * 2));
        } // end for
    } // end main
}
