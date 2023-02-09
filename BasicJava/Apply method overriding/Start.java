public class Start {
    public static void main(String[] args) {
        Figure f = new Figure(12, 8);
        System.out.println("Area is: "+f.area()+"\n");

        Triangle t = new Triangle(15, 11);
        System.out.println("Area of Triangle: "+t.area()+"\n");

        Rectangle r = new Rectangle(11, 8);
        System.out.println("Area of Rectangle: "+r.area());
    }
}
