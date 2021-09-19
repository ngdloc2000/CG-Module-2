package circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3,"red");
        Cylinder cy = new Cylinder(4,"blue", 5);
        System.out.println(c.toString());
        System.out.println(cy.toString());
    }
}
