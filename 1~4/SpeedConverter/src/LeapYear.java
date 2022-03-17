public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean returnValue = false;
        if (year >= 1 && year < 9999) {
            if (year % 400 == 0) {
                returnValue = true;
            } else if ((year % 4 == 0) && (year % 100 != 0)) {
                returnValue = true;
            } else {
                returnValue = false;
            }
        }
        return returnValue;
    }
}