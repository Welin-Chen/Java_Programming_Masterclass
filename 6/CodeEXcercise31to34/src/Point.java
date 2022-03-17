public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int dx = this.x - 0;
        int dy = this.y - 0;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public double distance(Point point) {
        int dx = this.x - point.x;
        int dy = this.y - point.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }

}