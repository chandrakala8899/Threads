package Threads;

public class ThreadDemoTest {
    public static void main(String[] args) {
        Thread thread1 = Thread.currentThread();
       Thread.currentThread().setName("chandu");
      String threadName=   Thread.currentThread().getName();
        System.out.println( thread1.getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getPriority());

Thread thread = new NumberCountThread();
thread.setName("Count thread -1");
thread.start();
thread.setPriority(1);
        Thread thread2= new NumberCountThread();
        thread2.setName("Count thread -2");
        thread2.start();
        thread2.setPriority(5);
        Thread thread3= new NumberCountThread();
        thread3.setName("Count thread -3");
        thread3.start();
        thread3.setPriority(10);


    }
}
