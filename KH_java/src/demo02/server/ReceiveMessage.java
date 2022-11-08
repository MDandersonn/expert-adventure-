package demo02.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ReceiveMessage extends Thread {

	private Socket sock;
	private BufferedInputStream bis;
	private BufferedOutputStream bos;
	
	public ReceiveMessage(Socket sock) throws IOException {
		this.sock = sock;
		this.bis = new BufferedInputStream(this.sock.getInputStream());
		this.bos = new BufferedOutputStream(this.sock.getOutputStream());
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				byte[] recv = new byte[4096];
				while(bis.available() != 0) {
					System.out.println("내부:" + bis.available());
					int len = bis.read(recv);
					if(len == -1) {
						System.out.println();
						break;
					}
					System.out.print(Arrays.toString(recv));
					System.out.print(new String(recv, 0, len));
					System.out.println(len + "/" + bis.available());
					bos.write("확인\r\n".getBytes());
					bos.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
