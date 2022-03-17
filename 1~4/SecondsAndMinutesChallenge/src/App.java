public class App {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) throws Exception {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(-3945));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (!(minutes >= 0 && (seconds >= 0 && seconds <= 59))) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hour = hours + "h";
        if (hours < 10) {
            hour = "0" + hour;
        }

        String min = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            min = "0" + min;
        }

        String sec = seconds + "s";
        if (seconds < 10) {
            sec = "0" + sec;
        }

        return (hour + " " + min + " " + sec);

        // return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

}
