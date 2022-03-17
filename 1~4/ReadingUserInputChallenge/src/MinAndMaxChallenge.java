import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Min = Integer.MAX_VALUE;
        int Max = Integer.MIN_VALUE;
        int number = 0;
        // boolean first = true;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                number = scanner.nextInt();

                // if (first) {
                // first = false;
                // Max = number;
                // Min = number;
                // }

                if (number > Max) {
                    Max = number;
                } else if (number < Min) {
                    Min = number;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Max number = " + Max);
        System.out.println("Min number = " + Min);

        scanner.close();
    }
}
