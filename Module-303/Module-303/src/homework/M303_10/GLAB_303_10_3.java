package homework.M303_10;

abstract class ShapeNew {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

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
    /** All shapes must provide a method called getArea() */
    public abstract double getArea();
    /** Returns a self-descriptive string */

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }
}

class CircleNew extends ShapeNew {
    protected double radius;
    private final double PI = Math.PI;

    public CircleNew(double radius) {
        this.radius = radius;
    }

    public CircleNew(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }
    public double getArea() {
        //double area = PI * this.radius * this.radius;
        double area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
        return area; //reference to  parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }
}


class RectangleNew extends ShapeNew {

    public RectangleNew(String color) {
        super.color = color;
    }

    public RectangleNew() {
    }
    public RectangleNew(String color, double width, double height) {
        super.height = height;
        super.width = width;
        super.color = color;
    }
    @Override
    public double getArea() {
        return super.width *  super.height;
    }
    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a Rectangle"  );
    }
    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
    }
}

class TriangleNew extends ShapeNew {

    public TriangleNew(){}


    public TriangleNew(String color) {
        super.color = color;
    }
    public void setBase(int base) {
        this.base = base;
    }
    @Override
    public double getArea() {
        return 0.5*super.base * super.height;
    }
    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle"  );
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle[base=" + super.base + ",height=" + super.height + "," + super.toString() + "]";
    }
}




public class GLAB_303_10_3 {
}


