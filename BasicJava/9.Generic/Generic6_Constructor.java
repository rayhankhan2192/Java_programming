public class Generic6_Constructor {
    private double value;
    //Generic constructor
    public <T extends Number> Generic6_Constructor(T objT){
        this.value = objT.doubleValue();
    }

    void showValue(){
        System.out.println("value: "+value);
    }

    public static void main(String[] args) {
        Generic6_Constructor test1 = new Generic6_Constructor(100);
        Generic6_Constructor test2 = new Generic6_Constructor(200);
        test1.showValue();
        test2.showValue();
    }
}
