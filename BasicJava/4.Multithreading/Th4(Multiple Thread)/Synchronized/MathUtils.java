public class MathUtils{

    //here used synchronized key word to execute at firts one Thread after end firsr then execute senond thread
    //synchronized
    void getMultiples(int n){
         //here used synchronized key word to execute at firts one Thread after end firsr then execute senond thread
       synchronized(this){
        for(int i=1; i<=5; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
       }
    }
}