import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10);
        myAL.add(22);

        for (Integer integer : myAL) {
            System.out.println(integer);
        }  // end for loop

        // Conversion of a string into integer
        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue +=10;

        System.out.println(numericValue);

        // Convert a string into a double
        String strPi = "3.14159";
        double myPi = Double.parseDouble(strPi);
        System.out.println(strPi);

    } // end main
}