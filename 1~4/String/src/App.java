public class App {
    public static void main(String[] args) throws Exception {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("my string is = " + myString);
        myString = myString + ", and this is more";
        System.out.println("my string is = " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("my string is = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("my string is = " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString=" + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString=" + lastString);

    }
}
