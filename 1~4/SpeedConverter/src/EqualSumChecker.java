public class EqualSumChecker {
    public static boolean hasEqualSum(int n1, int n2, int n3) {
        boolean returnValue = false;

        if ((n1 + n2) == n3) {
            returnValue = true;
        }
        return returnValue;
    }
}