import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static Map<String, String> vocabulary = new HashMap<String, String>();

    public static void main(String[] args) throws Exception {

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1,
                new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for small spring", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in valley beside a stream", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in forest", tempExit));

        tempExit.remove("S");
        command();
    }

    public static void command() {
        Scanner scanner = new Scanner(System.in);

        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("QUIT", "Q");

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());

            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            // String direction = scanner.nextLine().toUpperCase();
            String[] directionInput = scanner.nextLine().toUpperCase().split(" ");
            String direction = "null";
            for (String i : directionInput) {
                if (exits.containsKey(i)) {
                    direction = i;
                    break;
                }
                if (vocabulary.containsKey(i)) {
                    direction = vocabulary.get(i);
                    break;
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
        scanner.close();
    }
}
