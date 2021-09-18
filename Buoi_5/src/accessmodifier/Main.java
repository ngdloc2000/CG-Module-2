package accessmodifier;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle();

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
    }
}
