import java.io.*; 
import java.net.*;

public class Game extends Thread{
	private Socket[] players; 

	public Game(Socket[] players) {
		this.players = players; 
	}
}
