public class AutoBox2 {
    //autobox and unbox takes place with method parameter and return value
    static int value(Integer v){
        return v; //auto unbox to int value
    }

    public static void main(String[] args) {
        //pass an int to value() and assigned the return value
        //to an integer iob. Here the argument 100 is autoboxed
        //into an integer. the return value is also unboxed.

        Integer iob = value(100);
        System.out.println("Return value is: "+iob);
    }
    
}
