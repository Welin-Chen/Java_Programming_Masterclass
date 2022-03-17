import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            System.out.println("Enter number #" + (counter + 1) + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                counter++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid numbers");
            }
            scanner.nextLine();
        }
        System.out.println("sum of 10 numbers = " + sum);
        scanner.close();
    }
}
