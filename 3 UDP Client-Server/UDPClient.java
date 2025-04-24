package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket();
		InetAddress ipAddress = InetAddress.getLocalHost();
		String str = "Hello World";
		byte[] buf = str.getBytes();  //encode the string into a sequence of bytes and to save the string into a byte array
				
		DatagramPacket pac = new DatagramPacket(buf, buf.length,ipAddress, 4420); //datagram packet to send to the server
		
		client.send(pac);  // send the packet by calling client and passing packet pac
		
		
		client.close();
	}

}
