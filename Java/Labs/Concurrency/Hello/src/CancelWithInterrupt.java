import java.util.concurrent.TimeUnit;

public class CancelWithInterrupt {

    public static void main(String[] args) throws InterruptedException {
        Thread catchMain = Thread.currentThread();
        Thread hello = new Thread(() -> {
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignore){
                    return;
                }
            }
        });
        hello.start();
        catchMain.sleep(5000);
        hello.interrupt();
    }
}
