public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean returnValue = false;
        if (hourOfDay < 0 || hourOfDay > 23) {
        } else if ((barking) && (hourOfDay < 8 || hourOfDay > 22)) {
            returnValue = true;
        }
        return returnValue;
    }
}