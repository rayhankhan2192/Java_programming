
//Simple Generic method
public class Generic5_Method {
    //Determine is an object in an array
    static <Methods extends Comparable<Methods>, Value extends Methods> boolean isIn(Methods m, Value[] value){
        for(int i=0; i<value.length; i++){
            if(m.equals(value[i])){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer num[] = {1,2,3,4,5};
        if(isIn(2, num)){
            System.out.println("2 is in num");
        }
        if(!isIn(10, num)) 
        System.out.println("10 not in num");

        String str[] = {"one", "two", "three"};
        if(isIn("one", str))
        System.out.println("one in str");
        if(!isIn("Ten", str))
        System.out.println("Ten not in str");
    }
}
