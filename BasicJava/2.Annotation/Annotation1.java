import java.lang.annotation.*;
import java.lang.reflect.*;
//an annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

public class Annotation1 {
   //annnotate a method
   @MyAnno(str = "Annotation Example", val = 100)
   public static void myMeth(){
    Annotation1 obj = new Annotation1();

    //obtain the annotation for thid method & display the value of the membear
    try{
        //first get a Class object that represent this class
        Class<?> c = obj.getClass();
        //now get a method object that represent this method
        Method m = c.getMethod("myMeth");

        MyAnno anno = m.getAnnotation(MyAnno.class);
        System.out.println(anno.str());
        System.out.println(anno.val());
    }catch(NoSuchMethodException e){
        System.out.println(e);
    }
   }
   public static void main(String[] args) {
    myMeth();
   }
}
