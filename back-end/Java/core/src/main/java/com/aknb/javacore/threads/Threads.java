package com.aknb.javacore.threads;

public class Threads {

    public static void main(String[] args) {

//        ThreadGroup myGroup = new ThreadGroup("MyGroup");
//
//        CustomRunnable cr = new CustomRunnable(Colors.RED);
//        CustomRunnable cr1 = new CustomRunnable(Colors.GREEN);
//
//        Thread thread = new Thread(myGroup, cr, "Thread-1");
//        Thread thread1 = new Thread(myGroup, cr1, "Thread-2");
//        thread.start();
//        thread1.start();

//        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
//        mainGroup.list();

//        System.out.println(myGroup.activeCount());

        Counter counter = new Counter();

        Thread thread = new Thread(counter, "First");
        Thread thread1 = new Thread(counter, "Second");
        Thread thread2 = new Thread(counter, "Third");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
