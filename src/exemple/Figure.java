package exemple;

public abstract class Figure {
    private String name ;
    private float x;
    private float y;

    public Figure(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }


    public abstract void getPerimetr();
    public abstract void getArea();
    public abstract void showName();
    public abstract void coordinate();



}
