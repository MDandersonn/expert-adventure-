package Chapter27_Server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCP_ClientClass {

	public static void main(String[] args) {
		/*
		 * TCP클라이언트
			1.데이터를 전달할 서버IP주소와 port지정
			2. 서버와 연결하기 위한 소켓 객체 생성
			3.서버로부터 연결 승낙이 이루어지면 바로 입출력 스트림 생성
			4.서버와 통신 진행
			TCP는 이것은 패킷이 안보임 소켓내부에서 알아서함
		 * 
		 */
		Scanner sc =new Scanner(System.in);
		int serverPort=51000;
		InetAddress serverIp;
		try {
			serverIp= InetAddress.getByName("127.0.0.1");
			Socket sock = new Socket(serverIp,serverPort);//클라이언트도 통신할 소켓을 만듦.
			BufferedOutputStream bos = new BufferedOutputStream(sock.getOutputStream());
			
			while(true) {
				System.out.print("입력 : ");
				String msg= sc.nextLine();
				bos.write(msg.getBytes());
				bos.flush(); //이거 안하면 전송이안된다. 
			}
		
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
