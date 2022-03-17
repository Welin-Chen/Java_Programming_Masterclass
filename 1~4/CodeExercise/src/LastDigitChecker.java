public class LastDigitChecker {
    public static void main(String[] args) throws Exception {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!(isValid(n1) && isValid(n2) && isValid(n3))) {
            return false;
        }

        int rightMostDigit1 = n1 % 10;
        int rightMostDigit2 = n2 % 10;
        int rightMostDigit3 = n3 % 10;

        if ((rightMostDigit1 == rightMostDigit2) || (rightMostDigit1 == rightMostDigit3)
                || (rightMostDigit3 == rightMostDigit2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if ((number >= 10) && (number <= 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
