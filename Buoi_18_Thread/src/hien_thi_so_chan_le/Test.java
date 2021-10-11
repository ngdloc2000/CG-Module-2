package hien_thi_so_chan_le;

public class Test {
    public static void main(String[] args) {
        Thread even = new EvenThread();
        Thread odd = new OddThread();

        even.start();
        odd.start();
    }
}
