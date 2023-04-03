//this programe generate custome exception type
public class CustomException extends Exception{
    private int details;
    CustomException(int details){
        this.details = details;
    }

    public String toString(){
        return "MyException ["+details+"]";
    }
}
class ExceptionDemo{
    static void compute(int a) throws CustomException{
        System.out.println("Called Compute ("+a+")");
        if(a>10) throw new CustomException(a);
        System.out.println("Normal exit");
    }
    public static void main(String[] args) {
        try{
            compute(1);
            compute(2);
            compute(50);
        }catch(Exception e){
            System.out.println("Caught : " +e);
        }
    }
}
