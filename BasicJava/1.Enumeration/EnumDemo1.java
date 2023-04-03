public class EnumDemo1{
    enum Apple{
        Jonathan, GoldenDel, RedDel, Winesap, Cotland;
    }

    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Value of ap: "+ap);
        System.out.println();

        ap = Apple.Cotland;

        switch(ap){
            case Jonathan:
            System.out.println("Jonathan is Red");
            break;
            case GoldenDel:
            System.out.println("GoldenDel is Yellow");
            break;
            case RedDel:
            System.out.println("RedDel is Red");
            break;
            case Winesap:
            System.out.println("Winesap is Red");
            break;
            case Cotland:
            System.out.println("Cotlanad is Red");
            break;
        }
    }
}