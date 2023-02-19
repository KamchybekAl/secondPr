package exemple;

public class Square extends Rectangle {

    public Square(int a, int b,String name, float x, float y) {
        super(a, b, name, x, y);
    }

    @Override
    public void getPerimetr() {
        System.out.println("периметр квадрата со сторонами:" + getA() + " & "+ getB() + " равна "+ (getA()*4));

    }

    @Override
    public void getArea() {
        System.out.println("Площадь квадрвта со сторонами:" + getA() + " & "+ getB() + " равно "+ (getA()*getB()));

    }

    @Override
    public void showName() {

    }

    @Override
    public void coordinate() {

    }
}
