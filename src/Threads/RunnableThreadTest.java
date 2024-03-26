package Threads;

public class RunnableThreadTest {
    public static void main(String[] args) {
Runnable runnableThread = new NumberCountRunnable();
Thread thread = new Thread(runnableThread,"Runnable Thread-1");
thread.start();
    }
}
