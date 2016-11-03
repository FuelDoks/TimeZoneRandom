package Figures;

public class Coordinates {
    private double x;
    private double y;

    public Coordinates(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getDistance(Coordinates coords){
        return Math.sqrt(Math.pow(coords.getY() - getX(), 2
        + Math.pow(coords.getY() - getY(), 2)));
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "y=" + y +
                ", x=" + x +
                '}';
    }
}
