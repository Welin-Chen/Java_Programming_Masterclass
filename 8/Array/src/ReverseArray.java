import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws Exception {
        int[] Array = new int[] { 1, 2, 3, 4, 5 };

        reverse(Array);

    }

    private static void reverse(int[] Array) {
        System.out.println("Array = " + Arrays.toString(Array));
        for (int i = 0; i < Array.length / 2; i++) {
            int temp = Array[i];
            Array[i] = Array[Array.length - 1 - i];
            Array[Array.length - 1 - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(Array));
    }
}