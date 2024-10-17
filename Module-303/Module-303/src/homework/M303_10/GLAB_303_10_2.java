package homework.M303_10;

class Shape {
    private String color;
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;

    /** Constructs a Shape instance with only the given color */
    public Shape (String color) {
        this.color = color;
    }
    public Shape()
    {
    }
    /** Constructs a Shape instance with the given values */
    public Shape(String color, double area, double base, double width, double height) {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    /** All shapes must provide a method called getArea() */
    public double getArea() {
        // We have a problem here!
        // We need to return some value to compile the program.
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }
}

class Circle extends Shape {
    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }
    public double getArea() {
        //double area = PI * this.radius * this.radius;
        super.area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
        return super.area; //reference to  parent class variable
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

class Rectangle extends Shape {

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle() {
    }

    public Rectangle(String color, double area, double base, double width, double height)
    {
        super(color, area, base, width, height);
    }

    @Override
    public void setBase(double base) {
        super.base = base;   }
    @Override
    public void setWidth(double width) {
        super.width = width;   }
    @Override
    public double getArea() {
        return width * height;   }

    public double perimeter() {
        super.area =  super.width * super.height;
        return super.area;   }
    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a Rectangle"  );   }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
    }
}

class Triangle extends Shape {
    public Triangle(){}

    public Triangle(String color, double area, double base, double width, double height) {
        super(color, area, base, width, height);
    }

    public Triangle(String color) {
        super(color);
    }

    @Override
    public void setBase(double base) {
        super.base = base;
    }
    @Override
    public void setWidth(double width) {
        super.width = width;
    }
    @Override
    public double getArea() {
        return 0.5*base*height;
    }

    //Overriding method of base class with different implementation
    @Override
    public void displayshapName() {
        System.out.println("I am a TriAngle"  );
    }

    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }
}




public class GLAB_303_10_2 {
}
