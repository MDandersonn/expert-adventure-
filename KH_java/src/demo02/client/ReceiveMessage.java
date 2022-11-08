package demo02.client;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.Socket;

public class ReceiveMessage extends Thread {

	private Socket sock;
	private BufferedInputStream bis;
	
	public ReceiveMessage(Socket sock) throws IOException {
		this.sock = sock;
		this.bis = new BufferedInputStream(this.sock.getInputStream());
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				byte[] recv = new byte[4096];
				while(bis.available() != 0) {
					int len = bis.read(recv);
					if(len == -1) {
						System.out.println();
						break;
					}
					System.out.print(new String(recv, 0, len));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
