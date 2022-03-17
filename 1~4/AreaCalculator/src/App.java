public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("circle area = " + area(5));
        System.out.println("rectangle area = " + area(5, 10));

        printYearsAndDays(561600);

        printEqual(1, 1, 1); // should print text All numbers are equal
        printEqual(1, 1, 2); // should print text Neither all are equal or different
        printEqual(-1, -1, -1);// should print text Invalid Value
        printEqual(1, 2, 3); // should print text All numbers are different

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return (temperature <= 45 && temperature >= 25) ? true : false;
        } else {
            return (temperature <= 35 && temperature >= 25) ? true : false;
        }
    }

    public static void printEqual(int n1, int n2, int n3) {
        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("Invalid Value");
        } else {
            if (n1 == n2 && n2 == n3) {
                System.out.println("All numbers are equal");
            } else if (n1 != n2 && n2 != n3 && n1 != n3) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (60 * 24 * 365);
            long days = (minutes % (60 * 24 * 365)) / (60 * 24);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        if (x < 0 | y < 0) {
            return -1;
        }
        return x * y;
    }
}
