//functional interface
interface numericTest{
    boolean test(int n);
}
//interface to take two lambda expression parameter
interface numericTest2{
    boolean test(int x, int y);
}

public class Lambda2 {
    public static void main(String[] args) {

        numericTest isEven = (v) -> (v%2==0);//Lambda expression that check the number is even or not.
        if(isEven.test(20)) System.out.println("20 is even");
        if(!isEven.test(21)) System.out.println("21 is odd");

        numericTest isNonNegative = (n) -> (n>=0);
        if(isNonNegative.test(1)) System.out.println("1 is non negative");
        if(!isNonNegative.test(-1)) System.out.println("-1 is negative");

        numericTest2 isfactor = (x,y) -> (x%y)==0;
        if(isfactor.test(10, 2)) System.out.println("2 is factor of 10");
        if(!isfactor.test(10, 3)) System.out.println("3 is not factor of 10");

    }
}
