package Fan;

public class Main {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(f1.getFAST());
        f1.setRadius(10);
        f1.setColor("Yellow");
        f1.setOn(true);

        Fan f2 = new Fan();
        f2.setSpeed(f1.getMEDIUM());
        f2.setRadius(5);
        f2.setColor("Blue");
        f2.setOn(false);

        System.out.println(f1);
        System.out.println(f2);
    }
}
