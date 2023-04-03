public class MultipleException{
    public static void main(String[] args) {
        int  a = args.length;
        int c[] = {1};
        try{
            
            System.out.println("a = "+a);
            int b = 42/a;
            c[20] = 99;
        }catch(ArithmeticException  | ArrayIndexOutOfBoundsException e){
            System.out.println("Deviade by 0: "+e);
        }//catch(ArrayIndexOutOfBoundsException e){
             //System.out.println("Array index oob: "+e);
        //}
        System.out.println("After try/catch block");
    }
}