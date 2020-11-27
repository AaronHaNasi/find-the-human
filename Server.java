import java.net.*; 
import java.io.*;

public class Server {
	public static void main(String[] args) throws Exception {
		try {
			Socket[] players = new Socket[3]; 
			ServerSocket p1 = new ServerSocket(2222);
			ServerSocket p2 = new ServerSocket(2223);
			ServerSocket p3 = new ServerSocket(2224); 
			Game game;
			int games = 0;
			while(true) {
				players[0] = p1.accept(); 
				players[1] = p2.accept();
				players[2] = p3.accept(); 
				game = new Game(players);
				games++; 
				Thread thread = new Thread(game); 	
			}	
		}
		catch (IOException e) {
		System.err.println("Could not start game");
		System.exit(-1); 
		}	
	}
}
