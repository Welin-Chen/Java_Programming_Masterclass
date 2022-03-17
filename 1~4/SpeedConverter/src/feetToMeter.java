public class feetToMeter {
    public static double calcFeetAndInchesToCetimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double cetimeters = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + cetimeters + " cm");
            return cetimeters;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCetimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) (inches / 12.0);
            double remainingInches = (int) (inches % 12);
            System.out.println(inches + " inches = " + feet + " feet + " + remainingInches + " inches");
            feetToMeter.calcFeetAndInchesToCetimeters(feet, remainingInches);
        }
        return -1;
    }

}