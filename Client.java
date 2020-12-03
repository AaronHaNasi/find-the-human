import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws IOException {
        int playerNumber = 0; //initialized to 0, player must choose number between 1 and 0
        int port;
        String address;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Hello, please select a player number [1-3]:\n");
            while(!userInput.hasNextInt()) {
                userInput.next();
            }
            playerNumber = userInput.nextInt();
            if (playerNumber != 1 && playerNumber != 2 && playerNumber != 3) // check to see if number is between 1 and 3
                System.out.println("Please make sure the number is between 1 and 3.");
        } while(playerNumber != 1 && playerNumber != 2 && playerNumber != 3); // repeat if number is not between 1 and 3
        if ( playerNumber == 1 ) {
            port = 2222;
        }
        else if ( playerNumber == 2 ) {
            port = 2223;
        }
        else {
            port = 2224;
        }
        System.out.println("Please input game server IP address: ");
        address =  userInput.nextLine();
        Socket gameServer = new Socket( address, port);
    }
}
