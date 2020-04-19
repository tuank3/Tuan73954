package creatsocket;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//import java.util.Scanner;




public class Creatsocket {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			ServerSocket serverSocket = null;
		try {
			System.out.println("StartCreateSocket");
			serverSocket = new ServerSocket(6666);//create one socket port at 6666
			
			Socket socket = serverSocket.accept();//this socket wait for the client connect to the port you have to create before
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());
			
			System.out.println(socket.getInetAddress().getHostAddress().toString());
			//In ra ip socket
			//Scanner scanner = new Scanner(System.in);//đọc dữ liệu trên bàn phím nhập vào
			String string,string2;
			while(true) {
				string = inputStream.readUTF();
				if(string.equals("end")) {
					string2 = "Goodbye";
					outputStream.writeUTF(string2);
					outputStream.flush();
					break;
				}
				else if (string.equals("END")) {
					string2 = "Goodbye";
					outputStream.writeUTF(string2);
					outputStream.flush();
					break;
				}
				else if (string.equals("1")) {
					string2 = "One";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				else if (string.equals("2")) {
					string2 = "Two";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				else if (string.equals("3")) {
					string2 = "Three";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				else if (string.equals("4")) {
					string2 = "Four";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				else if (string.equals("5")) {
					string2 = "Five";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				else if (string.equals("6")) {
					string2 = "Six";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				else if (string.equals("7")) {
					string2 = "Seven";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				else if (string.equals("8")) {
					string2 = "Eight";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				else if (string.equals("9")) {
					string2 = "Nine";
					outputStream.writeUTF(string2);
					outputStream.flush();
				}
				
			}
		
			System.out.println(string);
			
			//create a base for save the client's data input 
			
			outputStream.close();
			inputStream.close();//close the stream input
			
			socket.close();//close client connect
			serverSocket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}