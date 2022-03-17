import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) throws Exception {
        int number = readInteger();
        System.out.println("number = " + number);
        // int[] array = readElements(5);
        System.out.println(findMin(readElements(number)));

    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        // scanner.close();
        return number;

    }
}