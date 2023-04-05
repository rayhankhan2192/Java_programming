//this programe generates two perameter in Generic class
class Generic<x,y>{
    x obx;
    y oby;

    Generic(x obx, y oby){
        this.obx = obx;
        this.oby = oby;
    }

    void showType(){
        System.out.println("Type of x is: "+obx.getClass().getName());
        System.out.println("Type of y is: "+oby.getClass().getName());

    }
    x getX(){
        return obx;
    } y getY(){
        return oby;
    }
}


public class Generic2 {
   public static void main(String[] args) {
    Generic<String,Integer> result = new Generic<String,Integer>("Two generic type", 2);
    result.showType();
    System.out.println("String : "+result.getX());
    System.out.println("Integer: "+result.getY());

    Generic<Double,Integer> result2 = new Generic<Double,Integer>(55.5, 20);
    System.out.println("Double : "+result2.getX());
    System.out.println("Integer: "+result2.getY());
    result2.showType();
   }
}
