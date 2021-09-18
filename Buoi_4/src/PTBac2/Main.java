package PTBac2;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation pt = new QuadraticEquation(1.0, 3, 1);
        System.out.println(pt.getDiscriminant());
        if (pt.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (pt.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép: " + (-pt.getB() / (2 * pt.getA())));
        } else if (pt.getDiscriminant() > 0) {
            System.out.println("Nghiệm 1 = " + pt.getRoot1());
            System.out.print("Nghiệm 2 = " + pt.getRoot2());
        }
    }
}
