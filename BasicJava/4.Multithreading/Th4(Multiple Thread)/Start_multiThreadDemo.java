public class Start_multiThreadDemo {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("One   ");
        NewThread t2 = new NewThread("Two   ");
        NewThread t3 = new NewThread("Three ");

        //Thread start from here
        t1.start();
        t2.start();
        t3.start();

        //isAlive() function return True if the Thread is Still running inside the programe else return false
        System.out.println("Thread 1 is running: "+t1.isAlive());
        System.out.println("Thread 2 is running: "+t2.isAlive());
        System.out.println("Thread 3 is running: "+t3.isAlive());

        try{
            //Thread.sleep(1000);
            System.out.println("Waiting for threads to finish");
            //join() function allows a program to wait fo the thread to compiete its execution before continuing
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread 1 is running: "+t1.isAlive());
        System.out.println("Thread 2 is running: "+t2.isAlive());
        System.out.println("Thread 3 is running: "+t3.isAlive());


        // try{
        //     Thread.sleep(10000);
        // }catch (InterruptedException e){
        //     System.out.println("Main thread interrupted");
        // }
        System.out.println("Main thread exiting\n\n");
    }
}
