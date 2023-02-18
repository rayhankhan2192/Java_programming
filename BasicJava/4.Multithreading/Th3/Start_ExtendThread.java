public class Start_ExtendThread {
    public static void main(String[] args) {
        NewThread th = new NewThread();
        th.start();

        try{
            for(int i=5; i>0; i--){
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException a){
            System.out.println("Main thread interrepted");
        }
        System.out.println("Main thread exiting");
    }
}
