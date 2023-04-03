public class EnumDemo2 {
    enum Apple{
        Jonathan(), GoldenDel, RedDel, Winesap, Cotland;
    }

    public static void main(String[] args) {
        Apple ap;
        System.out.println("\nHere are all Apple constant: ");
        Apple allApple[] = Apple.values();
        for(Apple a : allApple) System.out.println(a);

        try{
            ap = Apple.valueOf("Winesap");
        System.out.println("ap contains: "+ap);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
