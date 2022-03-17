import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) throws Exception {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnt = scanner.hasNextInt();

            if (isAnt) {
                counter++;
                int number = scanner.nextInt();
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }

        if (counter == 0) {
            avg = 0;
        } else {
            avg = (long) (Math.round(((double) sum) / counter));
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
