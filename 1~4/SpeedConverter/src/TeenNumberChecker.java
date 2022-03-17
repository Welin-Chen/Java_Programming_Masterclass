public class TeenNumberChecker {
    public static boolean hasTeen(int n1, int n2, int n3) {
        boolean returnValue = false;

        if ((n1 >= 13 && n1 <= 19) || (n2 >= 13 && n2 <= 19) || (n3 >= 13 && n3 <= 19)) {
            returnValue = true;
        }
        return returnValue;
    }

    public static boolean isTeen(int n1) {
        boolean returnValue = false;

        if (n1 >= 13 && n1 <= 19) {
            returnValue = true;
        }
        return returnValue;
    }
}