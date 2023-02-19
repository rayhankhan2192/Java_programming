//Serialized here;
import java.io.*;
public class Deserializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        User user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop\\JAVA CODE\\1.Serializations\\UserInfo.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();//cast the object with approapriate Class name inside ()
        in.close();
        fileIn.close();

        System.out.println("Name\t: "+user.name);
        System.out.println("ID\t\t: "+user.ID);
        System.out.println("Pass\t: "+user.password);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
