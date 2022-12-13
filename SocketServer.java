// import java.util.*;
// import java.net.*;
// import java.io.*;


// public class SocketServer{

//     ServerSocket serverSock;

//     public SocketServer(int port){

//         try{
//             serverSock = new ServerSocket(port);
//         }catch(Exception e){
//             System.err.println("Cannot establish server socket");
//             System.exit(1);
//         }
        
//     }

//     public void serve(){

//         while(true){
//             try{
//                 //accept incoming connection
//                 Socket clientSock = serverSock.accept();
//                 System.out.println("New connection: "+clientSock.getRemoteSocketAddress());
                
//                 //start the thread
//                 (new ClientHandler(clientSock)).start();
                
//                 //continue looping
//             }catch(Exception e){} //exit serve if exception
//         }
//     }

//     private class ClientHandler extends Thread{

//         Socket sock;
//         public ClientHandler(Socket sock){
//             this.sock=sock;
//         }

//         public void run(){
//             PrintWriter out=null;
//             BufferedReader in=null;
//             try{
//                 out = new PrintWriter(sock.getOutputStream());
//                 in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

//                 //read and echo back forever!
//                 while(true){
//                     Socket clientSock = serverSock.accept();

//                     System.out.println("Connection from: "+clientSock.getRemoteSocketAddress());
                
//                     PrintWriter pw = new PrintWriter(clientSock.getOutputStream());
//                     pw.println("Hello World");
//                     pw.println("HelloWorld");
//                        pw.println("SECRET");
//                        pw.println("3c3c4ac618656ae32b7f3431e75f7b26b1a14a87");
//                        pw.println("NAME");
//                        pw.println(name.getText());
//                        pw.flush();

            
//                 clientSock.close();//close the socket

//                     String msg = in.readLine();
//                     if(msg == null) break; //read null, remote closed
//                     out.println(msg);
//                     out.flush();
//                 }

//                 //close the connections
//                 out.close();
//                 in.close();
//                 sock.close();
                
//             }catch(Exception e){}

//             //note the loss of the connection
//             System.out.println("Connection lost: "+sock.getRemoteSocketAddress());
//         }

//     }

       
    
// }
