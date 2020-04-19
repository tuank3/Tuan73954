package ClientConnect;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.*;

public class ClientConnect {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("Bắt Đầu Kết Nối !!!");
			Socket socket = new Socket("localhost", 6666);
			String string = "";
			String string2 = "";
			Scanner scanner = new Scanner(System.in);
			
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				string2 = scanner.nextLine();
				dataOutputStream.writeUTF(string2);
				dataOutputStream.flush();
				
				string = dataInputStream.readUTF();
				System.out.println(string);
				if(string.equals("Goodbye")) {
					break;
				}
			}
			//dataOutputStream.writeUTF("end");
			
			dataOutputStream.close();
			dataInputStream.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}