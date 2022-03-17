public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(caculateInterest(10000, 2));

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", caculateInterest(10000, i)));
        }

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", caculateInterest(10000, i)));
        }

        int count = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime");
                count++;
                if (count == 3) {
                    break;
                }
            }
        }

        count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                System.out.println(i + " can be divided by 3 and 5");
                sum += i;
            }
            if (count == 5) {
                System.out.println("sum = " + sum);
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static double caculateInterest(double amount, double ineterestRate) {
        return amount * (ineterestRate / 100);
    }
}
