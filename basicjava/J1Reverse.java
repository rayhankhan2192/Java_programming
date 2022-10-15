package basicjava;
public class J1Reverse {
    public static void main(String[] srgs){
        short a=10,b=20,temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
