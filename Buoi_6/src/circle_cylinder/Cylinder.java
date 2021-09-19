package circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return Math.PI * getRadius()*getRadius();
    }

     @Override
    public String toString() {
        return getRadius() + " " + getHeight() + " " + getColor() + " " + getPerimeter();
     }
}
