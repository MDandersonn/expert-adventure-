package demo02.server;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendMessage extends Thread {

	private Scanner sc = new Scanner(System.in);
	private Socket sock;
	private BufferedOutputStream bos;
	
	public SendMessage(Socket sock) throws IOException {
		this.sock = sock;
		this.bos = new BufferedOutputStream(this.sock.getOutputStream());
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.print(": ");
			String msg = sc.nextLine();
			try {
				bos.write(msg.getBytes());
				bos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
