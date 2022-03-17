public class App {
    public static void main(String[] args) throws Exception {

        // Wall wall = new Wall(5, 4);
        // System.out.println("area = " + wall.getArea());

        // wall.setHeight(-1.5);
        // System.out.println("width = " + wall.getWidth());
        // System.out.println("height = " + wall.getHeight());
        // System.out.println("area = " + wall.getArea());

        // Point p1 = new Point(6, 5);
        // Point p2 = new Point(3, 1);
        // System.out.println("distance(0,0)=" + p1.distance());
        // System.out.println("distance(p2)=" + p1.distance(p2));
        // System.out.println("distance(2,2)=" + p1.distance(2, 2));

        // Point point = new Point();
        // System.out.println("distance()=" + point.distance());

        // Carpet carpet = new Carpet(3.5);
        // Floor floor = new Floor(2.75, 4);
        // Calculator calculator = new Calculator(floor, carpet);
        // System.out.println("total = " + calculator.getTotalCost());

        // carpet = new Carpet(1.5);
        // floor = new Floor(5.4, 4.5);
        // calculator = new Calculator(floor, carpet);
        // System.out.println("total = " + calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1, 1);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one real = " + one.getReal());
        System.out.println("one imaginary = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number real = " + number.getReal());
        System.out.println("number imaginary = " + number.getImaginary());

    }
}
