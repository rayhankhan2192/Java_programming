public class Thread_1 extends Thread{
    MathUtils Mu;

    public Thread_1(MathUtils mu){
        this.Mu = mu;
    }
    public void run(){
        try{
            Mu.getMultiples(2);
        }catch(Exception e){
            System.out.println("Exeption caught ");
        }
    }
}
