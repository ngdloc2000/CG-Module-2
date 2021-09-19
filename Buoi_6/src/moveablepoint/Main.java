package moveablepoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint mp = new MoveablePoint(1.0f, 2.0f);
        mp.move();
        mp.move();
        System.out.println(mp.toString());
    }
}
