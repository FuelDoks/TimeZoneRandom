package Figures;

import java.util.GregorianCalendar;

public class Square extends Figure {
    public static void main(String[] args) {

    }

    private Coordinates coords;

    private double lineLenght;

    public Square(double x, double y, double lineLenght) {
        this.coords = new Coordinates(x, y);
        this.lineLenght = lineLenght;

    }

    public Square(Coordinates coords, double lineLenght) {
        this.coords = coords;
        this.lineLenght = lineLenght;
    }

    public Coordinates getCoords() {
        return coords;
    }

    public void setCoords(Coordinates coords) {
        this.coords = coords;
    }

    public double getLineLenght() {
        return lineLenght;
    }

    public void setLineLenght(double lineLenght) {
        this.lineLenght = lineLenght;
    }

    @Override
    public double getPerimeter() {
        return lineLenght * 4;
    }

    @Override
    public double getDiameter() {
        return lineLenght * lineLenght;
    }

    @Override
    public double getTime() {
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "coords=" + coords +
                ", lineLenght=" + lineLenght +
                '}';
    }
}
