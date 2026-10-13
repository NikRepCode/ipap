package weekthree;

public class EuclidCalculateDistance implements ICalculateDistance {

    @Override
    public String name() {
        return "по Евклиду";
    }

    @Override
    public double distance(Point a, Point b) {
        int getXOperation = b.getX() - a.getX();
        int getYOperation = b.getY() - a.getY();

        return Math.sqrt(getXOperation * getXOperation + getYOperation * getYOperation);
    }
}
