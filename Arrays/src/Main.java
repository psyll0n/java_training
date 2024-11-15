import java.util.Arrays; // Class used to work with Arrays

public class Main {
    public static void main(String[] args) {
        // Define an empty array `vowels`
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // Print the character stored in the 2nd position of the Vowels array
        System.out.println(vowels[2]);

        // Before printing the entire array it needs to be converted to a string
        System.out.println(Arrays.toString(vowels));

        // Alternatively, an array can also be declared as follows
        char newArray[] = {'c', 'b', 'e', 'a', 'd'};
        System.out.println(Arrays.toString(newArray));

        // To replace a certain entry in an array, use the following syntax
        newArray[2] = 'x';
        System.out.println(Arrays.toString(newArray));

        // To get the length of an array use the `.length` property
        System.out.println(vowels.length);

        // To sort the entries in an array use the `.sort` method
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));

        char alphabetLetters[] = {'d', 'a', 'b', 'c', 'x', 'u', 'w', 'n', 'o', 'p', 'x', 'f', 'd', 'g'};

        // The `.sort` method can also be applied only to specific parts of an array
        int startingIndex = 0;
        int endingIndex = 3; // Note: The ending index is NOT included!
        Arrays.sort(alphabetLetters, startingIndex, endingIndex);
        System.out.println(Arrays.toString(alphabetLetters));

        /*
        To search for a certain value in an array use the `.binarySearch` method.
        Note: The binarySearch method works ONLY on sorted arrays!
        */
        char key = 'b';
        int foundItemIndex = Arrays.binarySearch(newArray, key); // Returns the index of the search key if found...
        System.out.println(foundItemIndex);

        // The `.binarySearch` method can also use a starting and ending index as search parameters
        int foundItemIndexKey = Arrays.binarySearch(newArray, key);
        System.out.println(foundItemIndexKey);
    }
}