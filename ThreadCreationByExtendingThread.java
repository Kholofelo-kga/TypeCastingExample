public class ThreadCreationByExtendingThread extends Thread {
    public void run() {
        System.out.println("Thread created by extending Thread class.");
    }

    public static void main(String[] args) {
        ThreadCreationByExtendingThread thread = new ThreadCreationByExtendingThread();
        thread.start();
    }
}
public class ThreadCreationByImplementingRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created by implementing Runnable interface.");
    }

    public static void main(String[] args) {
        ThreadCreationByImplementingRunnable threadObj = new ThreadCreationByImplementingRunnable();
        Thread thread = new Thread(threadObj);
        thread.start();
    }
}
