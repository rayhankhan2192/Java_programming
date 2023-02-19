//Serialized here;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

class Start{
    public static void main(String[] args) throws IOException {
        
        User user = new User();
        user.name = "Md. Rayhan Khan";
        user.password = "Rayhankhan9028";
        user.ID = "221-35-831";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println("Object info saved!");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}