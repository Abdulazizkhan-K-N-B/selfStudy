package uz.aknb.core.threads;

public class CustomRunnable implements Runnable{
    private String color;

    CustomRunnable(String color){
        this.color = color;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String threadName = Thread.currentThread().getName();
            System.out.println(Colors.CYAN_BG + color + threadName + "-" + i);
        }
    }
}
