package exemple;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 6, "myrRectangle", 5, 4);
        Square square1 = new Square(3,3,"mySquare",6,7);

        rectangle1.getPerimetr();
        rectangle1.getArea();
        rectangle1.showName();

        square1.getPerimetr();
        square1.getArea();

    }
}
