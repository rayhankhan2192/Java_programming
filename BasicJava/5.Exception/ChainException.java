public class ChainException {
    static void demoproc(){
        //create an exception
        NullPointerException e = 
        new NullPointerException("Top layer");
        //add cause
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            //display top level exception
            System.out.println("Caught: "+e);
            //display cause exception
            System.out.println("Orginal Cauase: "+e.getCause());
        }
    }
}
