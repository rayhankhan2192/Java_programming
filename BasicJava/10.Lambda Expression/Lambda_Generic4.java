//Generic function interface with lambda expresion
interface functions<T>{
    T values(T t);
}

public class Lambda_Generic4 {
    public static void main(String[] args) {
        
        //String based Version for the same Generic interfece
        functions<String> showString = (Str)->{//Lambda Expression
           String result = "";
           for(int i=Str.length()-1; i>=0; i--){
            result += Str.charAt(i);
           }
           return result;
        };
        System.out.println("Lambda reverse is : "+showString.values("Rayhan"));
        System.out.println("Lambda reverse is : "+showString.values("Lambda Exression"));

        //Integer based version for the generic interface
        functions<Integer> factorial = (n) -> {//lambda Expression
            int result =1;

            for(int i=1; i<=n; i++){
                result = i*result;
            }
            return result;
        };
        System.out.println("\nFactorial of 3 is: "+factorial.values(3));
        System.out.println("Factorial of 5 is: "+factorial.values(5));
    }
}
