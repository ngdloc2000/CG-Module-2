package accessmodifier;

public class Circle {
    private double radius;
    private String color;

    Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
