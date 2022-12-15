package ch.juventus.threads;

public class ThreadInfoExample {

    public static void main(String[] args) {
        Runnable task = new ThreadInfo();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        t1.start();
        t2.start();

        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }

}
