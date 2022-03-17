public class Main {
    public static void main(String[] args) throws Exception {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        boolean returnValue = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(returnValue);

        returnValue = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(returnValue);

        returnValue = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(returnValue);

        returnValue = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(returnValue);

        System.out.println("isLeapYear = " + LeapYear.isLeapYear(1700));
        System.out.println("isLeapYear = " + LeapYear.isLeapYear(1800));
        System.out.println("isLeapYear = " + LeapYear.isLeapYear(1900));
        System.out.println("isLeapYear = " + LeapYear.isLeapYear(2100));
        System.out.println("isLeapYear = " + LeapYear.isLeapYear(2200));
        System.out.println("isLeapYear = " + LeapYear.isLeapYear(2300));
        System.out.println("isLeapYear = " + LeapYear.isLeapYear(2500));
        System.out.println("isLeapYear = " + LeapYear.isLeapYear(2600));

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        System.out.println("hasEqualSum = " + EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println("hasEqualSum = " + EqualSumChecker.hasEqualSum(1, 1, 2));

        System.out.println("hasTen = " + TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println("hasTen = " + TeenNumberChecker.hasTeen(22, 22, 22));
        System.out.println("isTen = " + TeenNumberChecker.isTeen(9));
        System.out.println("isTen = " + TeenNumberChecker.isTeen(19));

        double cm = feetToMeter.calcFeetAndInchesToCetimeters(6, 0);
        if (cm < 0) {
            System.out.println("Invalid value");
        }

        feetToMeter.calcFeetAndInchesToCetimeters(157);
    }
}
