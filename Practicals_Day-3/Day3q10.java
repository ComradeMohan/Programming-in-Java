class MyThread extends Thread {
    private long sleepTime;
    private long startTime;
    private long endTime;

    public MyThread(String name, long sleepTime) {
        super(name);
        this.sleepTime = sleepTime;
    }

    public void run() {
        try {
            System.out.println(getName() + " started...");
            startTime = System.currentTimeMillis();
            Thread.sleep(sleepTime);
            endTime = System.currentTimeMillis();
            System.out.println(getName() + " finished...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public long getSleepTime() {
        return endTime - startTime;
    }
}
public class Day3q10 {
    public static void main(String[] args) {
       MyThread t1 = new MyThread("Thread 1", 2000);
        MyThread t2 = new MyThread("Thread 2", 3000);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long t1SleepTime = t1.getSleepTime();
        long t2SleepTime = t2.getSleepTime();

        if (t1SleepTime == t2SleepTime) {
            System.out.println("Both threads slept for the same time.");
        } else if (t1SleepTime > t2SleepTime) {
            System.out.println("Thread 1 slept for longer time.");
        } else {
            System.out.println("Thread 2 slept for longer time.");
        }
    }
}
