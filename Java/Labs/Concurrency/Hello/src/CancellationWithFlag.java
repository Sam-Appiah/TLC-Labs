import java.util.concurrent.TimeUnit;

public class CancellationWithFlag {
    private volatile static boolean StopIt = false;

    public static void main(String[] args) throws InterruptedException {
        Thread hello = new Thread(() -> {
            while (!StopIt) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignore){}
            }
        });
        hello.start();
        TimeUnit.SECONDS.sleep(5);
        CancellIt();
    }
    public static void CancellIt(){
        StopIt = true;
    }
}
