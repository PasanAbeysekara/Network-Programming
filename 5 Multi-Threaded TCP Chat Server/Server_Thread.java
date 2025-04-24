package socket_programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Server_Thread extends Thread {

	private Socket client;
	private BufferedReader in;
	private PrintWriter out;
	private Scanner ScannerInput;
	private int client_id;
	
	public Server_Thread(Socket client_socket, int cid) throws IOException {
		this.client = client_socket;
		in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		out = new PrintWriter(client.getOutputStream(), true);
		ScannerInput = new Scanner(System.in);
		this.client_id = cid;
	}
	
	@Override
	public void run() {
		try {
			out.println("Welcome to Chat Application");
			while (true) {

				String input = in.readLine();
				System.out.println("Client " + client_id + " says : " + input);

				System.out.print("Server : ");
				String output = ScannerInput.nextLine();
				out.println(output);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				client.close();
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
