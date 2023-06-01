//A functional interface for String operations
//TO create static mathod reference, use this syntax
//Syntex-> ClassName:: methodName
interface StringInterface{
    String strFunction(String n);
}

public class Method_static1 {
    static String stringOp(StringInterface s1, String s2){
        return s1.strFunction(s2);
    }

    public static void main(String[] args) {
    
        String inStr = "Ich bin Rayhan Khan!";
        String outStr;
    
        outStr = stringOp(StringOperation::strReverse, inStr);

        System.out.println("String before reverse: "+inStr);
        System.out.println("String after  reverse: "+outStr);

        outStr = stringOp(StringUpper::StrUppercase, inStr);
        System.out.println("String in UpperCase: "+outStr);
        
    }

    //This calss defines a static method called strReverse() for reverse
    public class StringOperation{
        //Static method that reverse a string
        static String strReverse(String str){
            String result = "";
            for(int i=str.length()-1; i>=0; i--){
                result += str.charAt(i);
            }
            return result;
        }
    }

    //This calss defines a static method called StrUppercase() for Uppercase
    public class StringUpper{
        static String StrUppercase(String str){
            return str.toUpperCase();
        }
    }
}
