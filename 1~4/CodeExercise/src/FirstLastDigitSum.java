public class FirstLastDigitSum {
    public static void main(String[] args) throws Exception {
        int number = 0;
        System.out.println(" FirstLastDigitSum in number " + (number = 252) + " = " + sumFirstAndLastDigit(number));
        System.out.println(" FirstLastDigitSum in number " + (number = 257) + " = " + sumFirstAndLastDigit(number));
        System.out.println(" FirstLastDigitSum in number " + (number = 0) + " = " + sumFirstAndLastDigit(number));
        System.out.println(" FirstLastDigitSum in number " + (number = 5) + " = " + sumFirstAndLastDigit(number));
        System.out.println(" FirstLastDigitSum in number " + (number = -10) + " = " + sumFirstAndLastDigit(number));
        System.out.println(" FirstLastDigitSum in number " + (number = 10) + " = " + sumFirstAndLastDigit(number));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        return (firstDigit + lastDigit);
    }
}
