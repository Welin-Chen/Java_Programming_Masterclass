public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        byte b = 10;
        short s = 20;
        int i = 50;
        // long l = (long) (50000 + 10 * (b + s + i));
        long l = 50000L + 10L * (long) (b + s + i);
        System.out.println(l);

        short shortTotal = (short) (1000 + 10 * (b + s + i));
    }
}
