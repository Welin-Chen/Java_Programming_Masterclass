public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        boolean returnValue = false;

        if ((int) (number1 * 1000) == (int) (number2 * 1000)) {
            returnValue = true;
        }
        return returnValue;
    }
}