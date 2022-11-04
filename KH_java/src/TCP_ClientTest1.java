import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_ClientTest1 {

	public static void main(String[] args) {
	String serverIpp;
	int serverPort=51000;
	try {
		serverIpp=InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIpp);
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	

	}

}
