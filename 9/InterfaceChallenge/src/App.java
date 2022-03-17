import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        tim.setWeapon("Stormbringer");
        System.out.println(tim);
        saveObject(tim);
        // loadObject(tim);
        System.out.println(tim);

        ISaveable werewwolf = new Monster("werewof", 20, 40);
        System.out.println(werewwolf);
        System.out.println("Strength = " + ((Monster) werewwolf).getStrength());
        saveObject(werewwolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n1 to enter a string\n0 to quit");

        while (!quit) {
            System.out.println("Coose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String inputString = scanner.nextLine();
                    values.add(index, inputString);
                    index++;
                    break;
            }

        }
        scanner.close();
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
