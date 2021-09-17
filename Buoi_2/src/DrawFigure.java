public class DrawFigure {
    public static void main(String[] args) {
        // Hình chữ nhật
        for (int i = 0;i <3;i++) {
            for (int j = 0;j<5;j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        // Hình tam giác vuông
        for (int i = 0; i<5;i++) {
            for (int j = 0; j <= i;j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        // Hình tam giác vuông
        for (int i = 0; i<5;i++) {
            for (int j = 0; j <5-i;j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
