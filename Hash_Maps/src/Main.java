import java.util.HashMap;  // Java Class required for HashMap definition and manipulation

public class Main {
    public static void main(String[] args) {
        // The HashMap data structure in Java is similar to the Python - Dictionary data structure
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        // The `.put` method can be used to add entries to the `examScores` HashMap
        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Computer Programming", 84);

        // Print out the hashmap
        System.out.println(examScores.toString());

        // Print out a single value that is stored in the `examScores` HashMap
        System.out.println(examScores.get("English"));

        /*
        Add an entry to the `examScores` HashMap in case such is currently missing.
        If there is such entry already present, do not override it.
        */
        examScores.putIfAbsent("Math", 75);

        // To replace an existing entry the `.replace` method can be used
        examScores.replace("Math", 79);
        System.out.println(examScores.toString());

        // To remove an entry, use the `.remove` method
        examScores.remove("Sociology");

        // Search for an entry with key "Biology". Display default value of `-1` in case the entry is absent
        System.out.println((examScores.getOrDefault("Biology", -1)));

        // To clear the entire `examScores` hashmap, use the `.clear` method
        examScores.clear();

        // To verify what is the size of a HashMap, use the `.size` method
        System.out.println(examScores.size());

        // To check whether a HashMap is empty use the `.isEmpty` method
        System.out.println(examScores.isEmpty());  // returns true


        examScores.put("Astronomy", 72);
        examScores.put("History", 90);
        examScores.put("Physics",85);
        examScores.put("Philosophy", 92);

        // Search for a specific key in the HashMap
        System.out.println(examScores.containsKey("Astronomy")); // returns true

        // Search for a specific value in the HashMap
        System.out.println(examScores.containsValue(100));  // returns false

        // A FOR EACH loop can be used to iterate over all keys and values in a HashMap
        examScores.forEach((subject, score) -> {
            System.out.println(subject + ": " + score);
        });

        // Iterate over each key and value in the `examScores` HashMap and modify the value of each `score` value
        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });
        System.out.println(examScores.toString());
    }
}