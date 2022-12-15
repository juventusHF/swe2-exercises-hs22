package ch.juventus.threads;

public class PrinterExample {

    public static void main(String[] args) {
        Printer printer = new Printer();
        PrinterJob printerJob = new PrinterJob(printer);

        Thread t1 = new Thread(printerJob);
        Thread t2 = new Thread(printerJob);

        t1.start();
        t2.start();
    }

}
