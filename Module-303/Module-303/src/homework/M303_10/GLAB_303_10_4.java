package homework.M303_10;

abstract class ShapeNew2 {
    protected String color;
    protected double height;  // To hold height.
    protected double width;  //To hold width
    protected double base;  //To  hold base

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

// The getArea method is abstract.
    // It must be overridden in a subclass.

    /**
     * All shapes must provide a method called getArea()
     */
    public abstract double getArea();

    /**
     * Returns a self-descriptive string
     */

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayshapName() {
        System.out.println("I am a Shape.");
    }
}

interface Movable {// An interface defines a list of public abstract methods to be implemented by the subclasses

    void moveUp();    // "public" and "abstract" by default

    void moveDown();

    void moveLeft();

    void moveRight();

    String getCoordinate();
}

class CircleNew2 extends ShapeNew2 implements Movable {
    protected double radius;
    private int x, y;   // x and y coordinates of the point
    private final double PI = Math.PI;

    /**
     * Constructs a MovablePoint instance at the given x and y
     */
    public CircleNew2(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public CircleNew2(double radius) {
        this.radius = radius;
    }

    public CircleNew2(double radius, double height) {
        this.radius = radius;

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public String getCoordinate() {
        return "";
    }

    @Override
    public double getArea() {
        return 0;
    }
}

public class GLAB_303_10_4 {
}
