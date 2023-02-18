class NewThread extends Thread{
    String name;
    Thread T;
    NewThread(String threadname){
        name = threadname;
        T = new Thread(this.name);
        System.out.println("New thread: "+T);
    }
    //this is the enrty point for thread
    public void run(){
        try{
            for(int i=5; i>0; i--){
                System.out.println(name+": " +i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name +"Interrepted");
        }
        System.out.println(name+"Exiting");
    }
}