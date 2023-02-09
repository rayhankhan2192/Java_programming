public class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    //override area() for triangle
    double area(){
        System.out.println("Inside area of Triangle ");
        return 0.5*length*width;
    }
    
}
