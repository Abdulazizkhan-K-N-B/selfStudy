package uz.aknb.core.threads;

public class Counter implements Runnable {
    int count;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }

        }
        System.out.println(Thread.currentThread().getName() + ": " + count);
    }

    synchronized void increment() {
        count++;
    }
}
