//Data implement here
import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = 1;

    String name;
    transient String password;//password will not serialized
    String ID;

    public void sayHello(){
        System.out.println("Hello! i am "+name);
    }
}
