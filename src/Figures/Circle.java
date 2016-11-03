package Figures;

public class Circle extends Figure {
    public static void main(String[] args) {

    }

    private Coordinates coords;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.coords = new Coordinates(x, y);
        this.radius = radius;
    }

    public Circle(Coordinates coords, double radius) {
        this.coords = coords;
        this.radius = radius;
    }

    public Coordinates getCoords() {
        return coords;
    }

    public void setCoords(Coordinates coords) {
        this.coords = coords;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = radius;

        }
    }

    public Circle() {
    }

    public double calculateLenght() {
        return radius * 2 * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getPerimeter() {
        return calculateLenght();
    }

    @Override
    public double getTime() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "coords=" + coords +
                ", radius=" + radius +
                '}';
    }
}
