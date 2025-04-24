package socket_programming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatServerT {

	private static final int PORT = 6677;

	public static void main(String[] args) throws IOException {

		System.out.println("\t\t Chat Server");
		System.out.println("\t\t====================\n\n");

		ServerSocket serverSocket = new ServerSocket(PORT);
		int current_clients = 1;
		
		try {
			while (true) {
				// Listening for any client socket requests
				Socket client = serverSocket.accept();
				System.out.println("Client is Connected............\n\n");

				Server_Thread ct = new Server_Thread(client, current_clients);
				ct.start();
				current_clients++;
			}
		} finally {
			serverSocket.close();
		}

	}

}
