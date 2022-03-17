public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("sum = " + sumOdd(1, 100));
        System.out.println("sum = " + sumOdd(-1, 100));
        System.out.println("sum = " + sumOdd(100, 100));
        System.out.println("sum = " + sumOdd(13, 13));
        System.out.println("sum = " + sumOdd(100, -100));
        System.out.println("sum = " + sumOdd(100, 1000));

        int number = 4;
        int finishNumber = 20;
        int evenNumberfound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            evenNumberfound++;
            System.out.println("Even number " + number);
            if (evenNumberfound == 5) {
                break;
            }
        }
        System.out.println("Total even number found = " + evenNumberfound);

        System.out.println("The sum of the digits in number " + (number = 125) + " = " + sunDigits(number));
        System.out.println("The sum of the digits in number " + (number = -125) + " = " + sunDigits(number));
        System.out.println("The sum of the digits in number " + (number = 4) + " = " + sunDigits(number));
        System.out.println("The sum of the digits in number " + (number = 32123) + " = " + sunDigits(number));
        System.out.println("The sum of the digits in number " + (number = 123456789) + " = " + sunDigits(number));
    }

    public static int sunDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (!((end >= start) && (start > 0) && (end > 0))) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isOdd(int number) {
        if (!(number > 0)) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }
}
