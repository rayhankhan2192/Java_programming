class NewThread implements Runnable{
   Thread t;
   NewThread(){
    //create a new a second thread
    t = new Thread(this, "Demo Thread");
    System.out.println("Child Thread: "+t);
   }

   public void run(){
    try{
        for(int i=5; i>0; i--){
            System.out.println("Child thread: "+i);
            Thread.sleep(1000);
        }
    }catch(InterruptedException a){
        System.out.println("Child interrupted");
    }
    System.out.println("Exiting child thread");
   }
}