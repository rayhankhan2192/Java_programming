//not excute the code

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String name();
    int result();
}
@Retention(RetentionPolicy.RUNTIME)
@interface what{
    String description();
}
@MyAnno(name = "Rayhan Khan", result = 95)
@what(description = "Good result")


public class Annotation2 {
    @what(description = "Good")
    @MyAnno(name = "mashrafe", result = 96)
   
    public static void myMethh(){
        Annotation2 obj = new Annotation2();
        try{
            Annotation annos[] = obj.getClass().getAnnotations();
            //all annotation for class Annotation2
            System.out.println("All annotation for mAnno2");
            for(Annotation a : annos)
            System.out.println(a);
            System.out.println();

            Class<?>c = obj.getClass();
            //all annotation for myMath()
            Method m = c.getMethod("myMethh");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println("All annotation for myMeth()");
            // for(Annotation a: annos)
            // System.out.println(a);
            System.out.println(anno.name());
            System.out.println(anno.result());

        }catch(NoSuchMethodException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        myMethh();
    }

}
