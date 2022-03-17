public class NumberPalindrome {
    public static void main(String[] args) throws Exception {
        int number = 0;
        System.out.println((number = 0) + " is palindrome? " + isPalindrome(number));
        System.out.println((number = -1221) + " is palindrome? " + isPalindrome(number));
        System.out.println((number = 707) + " is palindrome? " + isPalindrome(number));
        System.out.println((number = 11212) + " is palindrome? " + isPalindrome(number));

    }

    public static boolean isPalindrome(int number) {

        if (number == 0) {
            return true;
        } else if (number < 0) {
            number = -number;
        }

        int lastDigit = 0;
        int originNumber = number;
        int reverse = 0;

        while (number > 0) {
            lastDigit = number % 10;
            number /= 10;
            reverse = reverse * 10 + lastDigit;
        }

        if (originNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
