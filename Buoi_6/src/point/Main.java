package point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(4.0f, 3.1f);
        System.out.println(p2.toString());

        Point3D p3 = new Point3D(5.0f, 6.0f, 7.0f);
        p3.setXYZ(11.0f,12.0f,13.0f);
        System.out.println(p3.toString());
        System.out.println(Arrays.toString(p3.getXYZ()));
    }
}
