//functional interface
interface mynumber{
    double getValue();
}
public class Lambda1{
    public static void main(String[] args) {
        mynumber myNum; //interface reference

        myNum = ()-> 131.323;
        System.out.println(myNum.getValue());

        myNum = ()-> Math.random()*200;
        System.out.println("Randome vlue: "+myNum.getValue());
        System.out.println("Another Random: "+myNum.getValue());
        System.out.println("Another: "+myNum.getValue());
    }

}