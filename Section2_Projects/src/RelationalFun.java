public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 42;
        String myName = "Alex";
        String yourName = "John";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        // relational operations
        boolean ageComparison = myAge > yourAge;

        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge?: " + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names match?: " + nameComparison);

        boolean myCurrentAge = currentAge >= 21;
        System.out.println("My current age is greater than or equal to 21?: " + myCurrentAge);

    } //end main
}
