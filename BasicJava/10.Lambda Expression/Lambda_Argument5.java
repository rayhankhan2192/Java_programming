//Lambda Expression as an argument to a method
interface StringFunction{
    String StrFun(String n);
}

public class Lambda_Argument5 {

    static String stringMethod(StringFunction str1, String str2){
        //this method has a function interface as the type of its first parameter str1.
        //str1 can be passed a reference of any instance of that interface, instance creared by lambda expression
        //Second parameter str2 specifies the string to operate on.
        return str1.StrFun(str2);
    }
    public static void main(String[] args) {

        String inStr = "Pass Lambda Argument to the intaerface";
        String outStr;

        System.out.println("\nHere is instr String: "+inStr);

        //Lambda expression to pass uppercases string to the stringMethod().
        outStr = stringMethod((str) -> str.toUpperCase(), inStr);
        System.out.println("\nThe String in uppercase: "+outStr);

        //This passes a block Lambda that removes spaces
        outStr = stringMethod((str) -> {
            String result = " ";
            int i;
            for(i=0; i< str.length(); i++){
                if(str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;
        },inStr);
        System.out.println("\nString with space remove: "+outStr);

        //Its possible to pass a StaringFunction() instance
        StringFunction reverse = (str) -> {
            String result = " ";
            int i;
            for(i = str.length()-1; i>=0; i--){
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("\nString in reverse: "+stringMethod(reverse, outStr));
        

        System.out.println();
    }
}

