package weekthree;

public class Neumann implements ICalculateDistance {

    @Override
    public String name() {
        return "по фон Нейману";
    }

    @Override
    public double distance(Point a, Point b) {
        int getXOperation = Math.abs(a.getX() - b.getX());
        int getYOperation = Math.abs(a.getY() - b.getY());

        return getXOperation + getYOperation;
    }
}
