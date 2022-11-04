

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;

public class TCP_ServerClass {

	public static void main(String[] args) {
		
		/*
		 * TCP서버
		 * 	1.통신을 위한 Port 지정
		 * 	2.지정한 Port로 서버소켓 객체 생성
		 * 	3. 서버소켓으로 들어오는 연결 요청 대기 후 승낙
		 * 	4. 연결승낙후 클라이언트와의 연결 소켓 별도로 생성
		 *  5. 입출력스트림 생성
		 *  6. 입출력스트림으로 통신 진행
		 *  
		 * TCP포트 제외범위확인
		 * netsh interface ipv4 show excludedportrange protocol=tcp
		 * netstat -nao
		 * 
		 * 서버는 두개의 소켓(서버소켓,일반소켓)이있고 클라이언트는 하나 있다.
		 * 서버소켓은 승낙용도이고 , 승낙되면  따로 클라이언트와 통신할 일반소켓을 만듦.
		 */
		int port =51000;//1.포트지정하기
		
		try {
			ServerSocket serverSocket= new ServerSocket(port);
			Socket sock =serverSocket.accept();//서버소켓으로 들어오면 승낙
			BufferedInputStream bis = new BufferedInputStream(sock.getInputStream());
			while(true) {
				
				
				byte[] recv= new byte[3];
				System.out.println("while시작");
				int len = bis.read(recv);
				System.out.println("len:"+len);
				System.out.println("recv : "+ Arrays.toString(recv));
				System.out.println(new String(recv,0,len));
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
