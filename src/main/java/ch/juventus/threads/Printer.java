package ch.juventus.threads;

public class Printer {

    public synchronized void printNumbers() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

}
