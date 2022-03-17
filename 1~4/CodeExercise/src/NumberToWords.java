public class NumberToWords {
    public static void main(String[] args) throws Exception {
        // System.out.println(reverse(100));
        // System.out.println(reverse(123));
        // System.out.println(reverse(-123));

        // System.out.println(getDigitCount(0));
        // System.out.println(getDigitCount(1000));
        // System.out.println(getDigitCount(123));
        // System.out.println(getDigitCount(-1));

        // numberToWords(123);
        // numberToWords(100);
        numberToWords(11);
        // System.out.println(reverse(11));

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        int digit;
        int originNumber = number;
        number = reverse(number);
        int cntDiff = getDigitCount(originNumber) - getDigitCount(number);

        String word;

        while (number > 0) {
            digit = number % 10;
            number /= 10;

            switch (digit) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
                default:
                    word = "Invalid Value";
                    break;
            }
            System.out.println(word);
        }

        for (int i = 1; i <= cntDiff; i++) {
            System.out.println("Zero");
        }

    }

    public static int reverse(int number) {
        int digit = 0;
        int reverseNumber = 0;
        boolean negative = false;

        if (number < 0) {
            number = -number;
            negative = true;
        }

        while (number > 0) {
            digit = number % 10;
            number /= 10;
            reverseNumber = reverseNumber * 10 + digit;
        }

        if (negative) {
            reverseNumber = -reverseNumber;
        }

        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int counter = 0;

        while (number > 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }
}
