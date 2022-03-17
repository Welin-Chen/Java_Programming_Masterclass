import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) throws Exception {
        int[] array = getIntegers(5);
        sortIntegers(array);
        printArray(array);
        // [106, 26, 81, 5, 15]
    }

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            int max = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    array[j] = array[i + 1];
                    array[i + 1] = max;
                }
            }
            if (array[i] < array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        return array;
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}