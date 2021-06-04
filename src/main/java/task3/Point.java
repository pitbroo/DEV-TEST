package task3;

public class Point {
    int A;
    int B;

    public Point(int a, int b) {
        A = a;
        B = b;
    }

    @Override
    public String toString() {
        return "Point{" +
                "A=" + A +
                ", B=" + B +
                '}';
    }

    public int getA() {
        return A;
    }

    public Point setA(int a) {
        A = a;
        return this;
    }

    public int getB() {
        return B;
    }

    public Point setB(int b) {
        B = b;
        return this;
    }
}
