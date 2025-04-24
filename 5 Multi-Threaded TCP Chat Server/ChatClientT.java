package socket_programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientT {

	static int PORT = 6677;

	public static void main(String[] args) throws IOException {

		System.out.println("\t\t Chat Client");
		System.out.println("\t\t====================\n\n");

		Scanner scan = new Scanner(System.in);
		String input;
		String output;

		// Assigning local host ip as the server ip address : this calls for the
		// UnknownHostException
		InetAddress ipAddress = InetAddress.getLocalHost();

		// Creating Client Socket
		Socket socket = new Socket(ipAddress, PORT);

		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		try {
			while (true) {
				// Reading the input
				input = in.readLine();
				System.out.println("Server says : " + input);

				System.out.print("Client : ");
				output = scan.nextLine();
				out.println(output);
			}
		} finally {
			out.close();
			in.close();
			socket.close();
		}
	}
}
