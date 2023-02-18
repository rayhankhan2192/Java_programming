public class Start_ThreadDemo {
    public static void main(String[] args) {
        NewThread th = new NewThread();//create new thread
        th.t.start();
        try{
            for(int i=5; i>0; i--){
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException a){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting");
    }
}
