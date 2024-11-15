import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Scanner class used to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine(); 
        
        System.out.printf("Hello, %s. How old are you? ", name);

        // The scanner class will expect an integer as user input and store it in the variable `age`
        int age = scanner.nextInt();

        /* 
        Cleans up the input buffer after the `scanner.nextInt()` which leaves an `Enter` key press 
        Alternatively, the following approach can be used:

        int age = Integer.parseInt(scanner.nextLine());
        */ 
        scanner.nextLine();

        System.out.printf("%d is an excellent age to start programming! What language do you prefer? ", age);

        String language = scanner.nextLine();
        System.out.printf("%s is a very popular language.", language);

        // Close the scanner
        scanner.close();        
    }
}