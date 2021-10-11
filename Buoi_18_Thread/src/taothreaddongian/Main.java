package taothreaddongian;

import taoluongbangrunnable.RunnableDemo;

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng1 = new NumberGenerator("Thread-1");
        ng1.start();

        NumberGenerator ng2 = new NumberGenerator("Thread-2");
        ng2.start();
    }
}
