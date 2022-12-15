package ch.juventus.threads;

public class ThreadInfo implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello " + Thread.currentThread().getName());
    }
}
