package hien_thi_so_chan_le;

public class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Chẵn: " + i);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
