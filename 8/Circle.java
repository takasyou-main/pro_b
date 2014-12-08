// Circle.java
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
	this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
	this.radius = radius;
	setColor(color);
	setFilled(filled);
    }

    public double getRadius() {
	return radius;
    }

    public void setRadius() {
	this.radius = radius;
    }

    public double getArea() {
	return radius*radius*Math.PI;
    }

    public double getDiameter() {
	return 2 * radius;
    }

    public double getPerimeter() {
	return radius*2*Math.PI;
    }
}
