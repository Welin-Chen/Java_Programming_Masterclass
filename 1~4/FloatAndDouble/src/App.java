public class App {
    public static void main(String[] args) throws Exception {

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value=" + minFloatValue);
        System.out.println("Float max value=" + maxFloatValue);

        System.out.println("\n");
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value=" + minDoubleValue);
        System.out.println("double max value=" + maxDoubleValue);

        int a = 5 / 3;
        float b = 5f / 3f;
        double c = 5d / 3d;
        System.out.println("int=" + a);
        System.out.println("float=" + b);
        System.out.println("double=" + c);

        double pound = 200d;
        double kg = pound * 0.45359237d;
        System.out.println(kg);

        double pi = 3.1415927d;
        System.out.println(pi);
    }
}
