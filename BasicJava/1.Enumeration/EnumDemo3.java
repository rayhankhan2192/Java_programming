enum Apple{
    Jonathan(10), GoldenDel(12), RedDel(15), Winesap(20), Cotland(30);

    private int price;
    Apple(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
public class EnumDemo3 {
   public static void main(String[] args) {
    //display price of GoldenDel
    System.out.println("GoldenDel price: "+Apple.GoldenDel.getPrice());
    //display all apple price
    System.out.println("\nAll apple price: ");
    for(Apple a: Apple.values()){
        System.out.println(a +" price " +a.getPrice());
    }
   }
}
