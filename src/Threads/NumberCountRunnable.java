package Threads;

public class NumberCountRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("From runnableThread");
        for (int i = 0;i<10;i++) {
            System.out.println( Thread.currentThread().getName()+"   count "  +i +
                    "   Thread priority   " +Thread.currentThread().  getPriority());

        }
    }
}
