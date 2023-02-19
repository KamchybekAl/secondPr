package exemple;

public class Rectangle extends Figure {

    private int a;
    private int b;

    public Rectangle(int a, int b,String name, float x, float y) {
        super(name,x,y);
        this.a=a;
        this.b=b;
    }



    @Override
    public void getPerimetr() {
        System.out.println("Периметр прямоуголька со сторонами:" + a + " & "+ b + "равно "+ ((a+b)*2));

    }

    @Override
    public void getArea() {
        System.out.println("Площадь треугольника со сторонами: " + a +" & "+b+" равно "+ a*b );

    }

    @Override
    public void showName(
    ) {
        System.out.println("Name: " + getName());

    }

    @Override
    public void coordinate() {

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
