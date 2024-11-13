public class Main {
    public static void main(String[] args) {
        int number1 = 12;
        double number2 = 6;

        // Addition
        System.out.println(number1 + number2);

        number1 += 5;
        System.out.println(number1);

        // Subtraction
        System.out.println(number1 - number2);

        number1 -= 1;
        System.out.println(number1);

        // Multiplication
        System.out.println(number1 * number2);

        number1 *= 2;
        System.out.println(number1);

        // Division
        System.out.println(number1 / number2);

        number1 /= 2;
        System.out.println(number1);

        // Remainder (Modulo/Modulus)
        System.out.println(number1 % number2);

        number2 %= 2;
        System.out.println(number2);
    }
}