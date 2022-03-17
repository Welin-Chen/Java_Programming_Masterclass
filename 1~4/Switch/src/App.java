
public class App {
    public static void main(String[] args) throws Exception {
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was " + switchValue);
                break;
            case 2:
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Value was " + switchValue);
                break;
        }
        char switchChar = 'e';
        switch (Character.toUpperCase(switchChar)) {
            case 'A':
                System.out.println("swichChar = " + switchChar);
                break;
            case 'B':
                System.out.println("swichChar = " + switchChar);
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("swichChar = " + switchChar);
                break;

            default:
                System.out.println("Not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

        DayOfTheWeekChallenge(0);
        DayOfTheWeekChallenge(1);
        DayOfTheWeekChallenge(2);
        DayOfTheWeekChallenge(3);
        DayOfTheWeekChallenge(4);
        DayOfTheWeekChallenge(5);
        DayOfTheWeekChallenge(6);
        DayOfTheWeekChallenge(7);

        printNumberInWord(0);
        printNumberInWord(9);
        printNumberInWord(10);
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    public static void DayOfTheWeekChallenge(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Tursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }
}
