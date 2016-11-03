package Figures;

public class Exile {
    public static void main(String[] args) {
        Square Ass = new Square(3d, 6d, 11d);

        Coordinates coords = new Coordinates(2d, 3d);

        Circle b = new Circle(coords, 5d);

        System.out.println(Ass);
        System.out.println(b);
        System.out.println(Ass.getCoords().getDistance(b.getCoords()));


    }
}
