public class Main {
    public static void main(String[] args) {
        // String declaration
        String name = "Psyll0n"; // %s
        String country = "Bulgaria";
        int age = 45; // %d
        String company = "Test Company Inc";
        double gpa = 4.5; // %f

        System.out.println(name);

        // Strings can also be declared in the following way
        String newName = new String("Alex Yakimov");
        System.out.println(newName);

        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("XYZ");

        System.out.println(literalString1 == literalString2); //true
        /* Returns `false` because of the `new String()' string definition */
        System.out.println(objectString1 == objectString2); 

        // The below returns true because of the `.equals` method
        System.out.println(literalString1.equals(literalString2));

        // Compares `objecString1` with `objecString2` but ignores the case of the letters
        System.out.println(objectString1.equalsIgnoreCase(objectString2));

        // The variables defined above can also be outputted in the following way 
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f", name, country, age, company, gpa);
        
        // Use %b for boolean
        // Use %c for character
        
        /* Outputting multiple strings by using concatenation
        System.out.println("Hello, World! I am " + name + ". I am from " + country + ". I am " + age + " years old. I work for " + company);
        */ 

        System.out.println(formattedString);

        // Alternatively, the `.format` method can be combined with the `.println` method
        System.out.println(String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f", name, country, age, company, gpa));

        // Check what is the length of a string / variable by using the `.length` method
        System.out.println(name.length());

        // Check whether a string is empty or not with the `.isEmpty` method
        System.out.println(name.isEmpty()); // false

        // Convert the case of a string to upper case with the `.toUpperCase` method
        System.out.println(name.toUpperCase()); // Note that the original string `name` does not change

        // Convert the case of a string to lower case with the `.toUpperCase` method
        System.out.println(name.toLowerCase());

        // The `.replace` method can be used to replace certain parts of a string
        String Sentence = "The sky is blue";
        System.out.println(Sentence.replace("blue", "dark"));

        // Note that the original `Sentence` string remains unchanged
        System.out.println(Sentence);

        // To permanently modify a string use the `.replace` method and store the value in a new string
        String ModifiedSentence = Sentence.replace("blue", "dark");
        System.out.println(ModifiedSentence);

        // Check whether a string contains certain value
        System.out.println(Sentence.contains("sky")); // returns true
    }
}