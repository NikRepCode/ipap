package weekthree;

public class Section {
    private final Point a;
    private final Point b;

    public Section(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public double lengthSection(ICalculateDistance method) {
        return method.distance(a, b);
    }

    @Override
    public String toString() {
        return "Section{" + a + ", " + b + "}";
    }
}
