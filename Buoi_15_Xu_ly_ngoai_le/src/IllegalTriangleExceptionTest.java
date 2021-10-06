public class IllegalTriangleException {
    public static void checkTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Đây là 1 tam giác");
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        try {
            checkTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println("Không phải tam giác");
        }
    }
}
