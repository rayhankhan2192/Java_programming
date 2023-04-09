// Import necessary classes for networking and input/output operations
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

// Define the Server class
public class Server {
    Socket socket; // Declare a socket object to establish connection with the client
    ServerSocket serverSocket; // Declare a server socket object to listen for connections

    BufferedReader br; // Declare a BufferedReader object to read data from the socket
    PrintWriter out; // Declare a PrintWriter object to write data to the socket

    // Constructor for the Server class
    public Server(){
       try{
        serverSocket = new ServerSocket(6666); // Create a new ServerSocket on port 6666
        System.out.println("Server is ready to accept connection");
        System.out.println("Waitting....");
        socket = serverSocket.accept();
        Thread.sleep(3000);
        System.out.println("Connected"); // Wait for a client to connect and establish a socket connection

        br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Initialize the BufferedReader with the input stream from the socket
        out = new PrintWriter(socket.getOutputStream()); // Initialize the PrintWriter with the output stream from the socket

        startReading(); // Start the thread to read input from the client
        startWritting(); // Start the thread to write output to the client

       } catch(Exception e){ // Catch any exceptions that may occur during initialization
        System.out.println(e); // Print the error message to the console
       }
    }

    // Method to read input from the client
    private void startReading() {
        //Thread writting = new Thread(() ->{});//we can use thread like thatx
        Runnable readingRunnable = ()->{
            try {
            while(true){ // Loop indefinitely to listen for input from the client
                
                    String msg = br.readLine(); // Read a line of text from the client's input stream
                    if(msg.equals("exit")){ // If the client sends "exit", terminate the chat and close the socket
                        System.out.println("Client Terminated the chat");
                        socket.close(); // Close the socket connection with the client
                        break; // Exit the loop
                    }
                    System.out.println("User: "+msg); // Print the message to the console
                } 
               
            }catch (IOException e) { // Catch any exceptions that may occur during input reading
                e.printStackTrace(); // Print the error message to the console
            }
        };
        new Thread(readingRunnable).start(); // Start a new thread to run the input reading loop
    }

    // Method to write output to the client
    private void startWritting() {
        Runnable writtingRunable = ()->{
            try{
            while(true){ // Loop indefinitely to write output to the client
                
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); // Initialize a new BufferedReader to read input from the console

                    String content = br1.readLine(); // Read a line of text from the console input
                    out.println(content); // Write the text to the client's output stream
                    out.flush(); // Flush the stream to ensure the data is sent immediately
                    if(content.equals("exit")){ // If the user types "exit", terminate the chat and close the socket
                        socket.close(); // Close the socket connection with the client
                        break; // Exit the loop
                    }
                }
            }catch(Exception e){ // Catch any exceptions that may occur during output writing
                e.printStackTrace(); // Print the error message to the console
            }
        };
        new Thread(writtingRunable).start(); // Start a new thread to run the output writing loop
    }

    public static void main(String[] args) {
        new Server();
    }
}