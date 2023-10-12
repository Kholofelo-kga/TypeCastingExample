class SynchronizedDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(new MyRunnable(resource));
        Thread thread2 = new Thread(new MyRunnable(resource));

        thread1.start();
        thread2.start();
    }
}

class SharedResource {
    synchronized void printMessage(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable {
    SharedResource resource;

    MyRunnable(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.printMessage("Hello from Thread " + Thread.currentThread().getId());
    }
}
