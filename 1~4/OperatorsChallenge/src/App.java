public class App {
    public static void main(String[] args) throws Exception {
        double d1 = 20d;
        double d2 = 80d;
        double Total = 100.00d * (d1 + d2);
        System.out.println("Total = " + Total);
        double Remainder = Total % 40.00d;
        System.out.println("Remainder = " + Remainder);
        boolean isNoRemainder = (Remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
