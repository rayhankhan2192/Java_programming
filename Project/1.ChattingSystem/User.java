import java.io.*;
import java.net.Socket;

public class User {
    Socket socket;
    BufferedReader br;
    PrintWriter out;

    public User() {

        try {
            System.out.println("Sending request to server...");
            socket = new Socket("localhost",6666);
            Thread.sleep(3000);
            System.out.println("Connected");

            br = new BufferedReader(new InputStreamReader(socket
            .getInputStream()));
            out = new PrintWriter(socket
            .getOutputStream());
            startReading();
            startWritting();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void startReading() {
        Runnable readingRunnable = ()->{
            try {
            while(true){
                
                    String msg = br.readLine();
                    if(msg.equals("exit")){
                        System.out.println("Server Terminated the chat");
                        socket.close();
                        break;
                    }
                    System.out.println("Server: "+msg);
                } 
               
            }catch (IOException e) {
                e.printStackTrace();
            }
        };
        new Thread(readingRunnable).start();
    }


    protected void startWritting() {
        Runnable writtingRunable = ()->{
            try{
            while(true){
               
                    BufferedReader br1 = new BufferedReader(new 
                    InputStreamReader(System.in));

                    String content = br1.readLine();
                    out.println(content);
                    out.flush();
                    if(content.equals("exit")){
                        socket.close();
                        break;
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        };
        new Thread(writtingRunable).start();
    }

    public static void main(String[] args) {
        new User();
    }
}
