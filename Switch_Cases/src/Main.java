import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("What operation do you want to perform? Choose between `sum`, `sub`, `mul`, `div`, `pow`: ");
        String operation = scanner.nextLine();

        /* 
            Case logic used to get user input and select the mathematical operation to perform.
            Note: Switch case logic is executed faster than IF - ELSE logic...
        */ 
        switch(operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "div":
                if (number2 == 0) {
                    System.out.println("Cannot divide by zero...");
                } else {
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                }
                break;
            case "pow":
                System.out.printf("%f ^ %f = %f", number1, number2, Math.pow(number1, number2));
                break;   
            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}
