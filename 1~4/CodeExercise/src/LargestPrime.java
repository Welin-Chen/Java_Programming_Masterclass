public class LargestPrime {
    public static void main(String[] args) throws Exception {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        boolean isPrime = true;
        int maxPrime = 0;

        for (int i = 2; i <= number; i++) {
            if ((number % i) == 0) {
                for (int j = 2; (j <= (i / 2)); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    if (i > maxPrime) {
                        maxPrime = i;
                    }
                }
            }
        }
        if (maxPrime != 0) {
            return maxPrime;
        } else {
            return -1;
        }
    }

    // public static boolean isPrime(int number) {
    // for (int i = 2; (i <= (number / 2)); i++) {
    // if (number % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }
}
