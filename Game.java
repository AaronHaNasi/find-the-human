import java.io.*; 
import java.net.*;

public class Game extends Thread{
	private Socket[] players; 

	public Game(Socket[] players) {	this.players = players; }

	public void run() {
		DataOutputStream toPlayer1 = new DataOutputStream(players[0].getOutputStream());
		BufferedReader fromPlayer1 = new BufferedReader(new InputStreamReader(players[0].getInputStream()));
		int numberOfBots = Integer.parseInt(fromPlayer1.readLine());

		

		// int botNumber = fromPlayer1.read(4);
	}
}
