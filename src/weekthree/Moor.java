package weekthree;

public class Moor implements ICalculateDistance {
    @Override
    public String name() {
        return "по Муру";
    }

    @Override
    public double distance(Point a, Point b) {
        int getXOperation = Math.abs(a.getX() - b.getX());
        int getYOperation = Math.abs(a.getY() - b.getY());

        return Math.max(getXOperation, getYOperation);
    }
}
