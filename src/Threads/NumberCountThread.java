package Threads;

public class NumberCountThread extends  Thread {
    public void run() {
        System.out.println("Number Count Thread");

        for (int i = 0;i<5;i++) {
            System.out.println( Thread.currentThread().getName()+"   count "  +i + "  Thread priority " +Thread.currentThread().  getPriority());

        }
    }
}

