package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		DatagramSocket server = new DatagramSocket(4420);
		byte[] buf = new byte[256];  // this array can hold 256 bytes. To create a byte array in Java, you first declare a variable of type byte[] and then allocate memory for it using the new keyword:
		
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		server.receive(packet);    // since we are going to read data from client
		String response =  new String(packet.getData());  // reading data and converting it to a string
		System.out.println("Response Data: "+response);
		
		server.close();
	}

}
