import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println(languages.containsKey("Java"));
            System.out.println("Java is already exist");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added sucessfully");
        }
        languages.put("Python",
                "an interpreted, object-oriented, high level programing language with dynamic sematics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already exist ? " + "ans: " + languages.containsKey("Java"));
        } else {
            languages.put("Java", "this course is about Java");
            System.out.println("Java added sucessfully");
        }

        System.out.println("=========================================");

        // languages.remove("Lisp");
        if (languages.remove("Algol", " algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if (languages.replace("Lisp", "Therein lies madness",
                "a functional programing language with imperative features")) {
            System.out.println("List replaced");
        } else {
            System.out.println("List was not replaced");
        }

        // System.out.println(languages.replace("Scala", "this will not be added"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
