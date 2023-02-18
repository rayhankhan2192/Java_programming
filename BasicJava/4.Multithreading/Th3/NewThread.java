//extending thread
class NewThread extends Thread {
    NewThread() {
        // create a new second thread
        super("Demo thread");
        System.out.println("Child thread: " + this);
    }

    // entry point for the second thread
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}