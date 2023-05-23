// Block lambda that computes the factorial of an int value

interface NumericFun{
    int function(int n);
}

public class Lambda_Block_exp3 {
    public static void main(String[] args) {

        NumericFun factorial = (n) ->{//block lambda expression
            int results = 1;

            for(int i=1; i<=n; i++){
                results = i*results;
            }
            return results;
        };

        System.out.println("Factorial of 3 is: "+factorial.function(3));
        System.out.println("Factorial of 5 is: "+factorial.function(5));
        System.out.println("Factorial of 7 is: "+factorial.function(7));
    }
    
}
