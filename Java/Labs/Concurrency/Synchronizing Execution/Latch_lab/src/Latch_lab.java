import java.util.concurrent.CountDownLatch;

public class Latch_lab {

    public static void main(String[] args) {
        int threadcount = 5;
        CountDownLatch Gate = new CountDownLatch(threadcount);

        for (int i = 1; i <= threadcount; i++) {
            Thread thread = new Thread(new MyRunnable(i, Gate));
            thread.start();
        }
        try {
          Gate.await();
        } catch (InterruptedException ignore){
            System.out.println("From main Thread: Threads Started: Thread ID " + Thread.currentThread().getId());
        }
    }
}

class MyRunnable implements Runnable {
    private final int index;
    private CountDownLatch Gate;
    public MyRunnable(int index, CountDownLatch Gate) {
        this.index = index;
        this.Gate = Gate;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(index * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread " + index + " done! : Thread ID " + Thread.currentThread().getId());
        }
        Gate.countDown();
    }
}
