public class ThreadSleepWaitDemo {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread sleepThread = new Thread(() -> {
            System.out.println("Sleep Thread: Starting...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sleep Thread: Done.");
        });

        Thread waitThread = new Thread(() -> {
            System.out.println("Wait Thread: Starting...");
            synchronized (lock) {
                try {
                    lock.wait(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Wait Thread: Done.");
        });

        sleepThread.start();
        waitThread.start();
    }
}
