package Lecture08;

abstract class Shape {
    String color;
    boolean isFilled;

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}

class Circle extends Shape {
    double radius;

    public Circle(double radius, String color, boolean isFilled){
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean isFilled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.isFilled = isFilled;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}

class Square extends Rectangle {
    double side;

    public Square(double sideA, double sideB) {
        super(sideA, sideB);
        this.side = sideA;
    }

    public Square(double side) {
        this(side, side);
    }


    public Square(double side, String color, boolean isFilled) {
        this.side = side;
        this.color = color;
        this.isFilled = isFilled;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}


public class Exercise1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape

        System.out.println(s1);

        System.out.println(s1.getArea());

        System.out.println(s1.getPerimeter());

        System.out.println(s1.getColor());

        System.out.println(s1.isFilled());

// System.out.println(s1.getRadius());

        Circle c1 = (Circle) s1; // Downcast back to Circle

        System.out.println(c1);

        System.out.println(c1.getArea());

        System.out.println(c1.getPerimeter());

        System.out.println(c1.getColor());

        System.out.println(c1.isFilled());

        System.out.println(c1.getRadius());

//Shape s2 = new Shape(); // Abstract class cannot be instanciated

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast

        System.out.println(s3);

        System.out.println(s3.getArea());

        System.out.println(s3.getPerimeter());

        System.out.println(s3.getColor());

// System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle) s3; // downcast

        System.out.println(r1);

        System.out.println(r1.getArea());

        System.out.println(r1.getColor());

        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6, "red", true); // Upcast

        System.out.println(s4);

        System.out.println(s4.getArea());

        System.out.println(s4.getColor());

// System.out.println(s4.getSide());

// Take note that we downcast Shape s4 to Rectangle,

// which is a superclass of Square, instead of Square

        Rectangle r2 = (Rectangle) s4;

        System.out.println(r2);

        System.out.println(r2.getArea());

        System.out.println(r2.getColor());

// System.out.println(r2.getSide());

        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square

        Square sq1 = (Square) r2;

        System.out.println(sq1);

        System.out.println(sq1.getArea());

        System.out.println(sq1.getColor());

        System.out.println(sq1.getSide());

        System.out.println(sq1.getLength());
    }
}

