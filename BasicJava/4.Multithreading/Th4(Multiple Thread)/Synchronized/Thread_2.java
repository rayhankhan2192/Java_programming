public class Thread_2 extends Thread{
    MathUtils mu;

    public Thread_2(MathUtils mu){
        this.mu = mu;
    }

    public void run(){
       try{
        mu.getMultiples(3);
       }catch(Exception e){
        System.out.println("Exeption Raised: "+e);
       }
    }
}
