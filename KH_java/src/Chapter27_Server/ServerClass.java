package Chapter27_Server;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerClass {
	public static void temp(String name, byte[] rowData, byte length) {
		File f = new File("D:\\ "+ name);
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f,true))){
			bos.write(rowData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		/*
		 * 네트워크프로그래밍
		 *  - 네트워크로 연결된 컴퓨터 장치 간에 데이터를 송/수신 할수 있도록 만드는 프로그래밍
		 *  - 서버와 클라이언트로 역할을 나누어서 작성하게 된다.
		 *  - 네트워크 연결에 필요한 정보로 IP주소와 port번호가 있으며, 이 정보를 통해 연결할 서버와 클라이언트를 식별하게 된다.
		 *  - 네트워크 연결을 통해  데이터를 송/수신할때 2가지  전송 방식이 있으며 각각 TCP UDP라고함
		 *  UDP의 경우 신뢰성은 낮지만 데이터전송 속도가 빠름
		 *  TCP의 경우 신뢰성은 높으며 데이터전송 속도가 느림
		 */
		/*
		 * UDP서버
		 * 	1.통신을 위한 Port 지정
		 * 	2.지정한 Port로 데이터소켓 객체 생성
		 * 	3. 데이터그램패킷 객체 생성 (클라이언트가 보낸 메시지를 받을 패킷객체를 생성)
		 * 	4. 수신대기
		 * 5. 데이터를 수신한 후에는 클라이언트가 요청한 정보에 맞추어 동작 후 처리 결과를 전달
		 * 6.처리결과를 전달하기 위해 데이터그램 패킷 객체 생성
		 * 7.만들어진 패킷 객체로 전송
		 * 8. 3번~7번까지의 과정이 반복
		 * 
		 */
		//클라이언트는 랜덤한포트사용해서 신경안써도된다.
		int port =51000;//1.포트지정하기
		//cmd 에서 neststat -nao | findstr 50000
		//포트를 사용하고있는지 포트확인 사용하고있으면 안됨
		//netsh interface ipv4 show excludedportrange protocol=udp
		//여기에 작성된 포트는 윈도우에서사용하지못하게 제한걸어놔서 못씀
		
		try {
			DatagramSocket dSocket= new DatagramSocket(port);
			while(true){
				byte recv[]= new byte[4096];//데이터가 들어올 공간. 
				DatagramPacket recvPacket =new DatagramPacket(recv , recv.length);//데이터그램패킷생성//수신용패킷이다.

				System.out.println("데이터 수신 대기중....");
				dSocket.receive(recvPacket);//받은데이터를 패킷에 넣어라라는 의미     ,  B가보냈다는것을 감지
				//위까지 패킷이오기전까지 대기하는거(멈춤) 상대방이 보낼때까지.
				
				//소켓으로들어와서 그걸 패킷의배열에 넣는다는게아닐까?
				
				
				String recvData = new String(recvPacket.getData(),0,recvPacket.getLength());
				//0,recvPacket.getLength() 이걸 추가해야 밑에 ~에대한처리가완료되었습니다 까지 잘나오게됨.
				//받아올때 배열크기만큼 다받아온다.  받은만큼만 받아오게 겟렝스를 해준다.
				
				System.out.println("클라이언트가 보낸 메시지: "+ recvData);
				
				System.out.println("클라이언트 요청 처리후 결과 전달!");
				byte byteData[] = (recvData+"에 대한 처리가 완료되었습니다.").getBytes();
				//4096+"  글자수"만큼 넣는데
				//클라이언트쪽에서 4096만큼받을수있게 크기지정해서  클라이언트가 받을때 짤린것.
				
				DatagramPacket sendPacket = new DatagramPacket(byteData,byteData.length , recvPacket.getAddress(),recvPacket.getPort());
				dSocket.send(sendPacket);
			}
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 소켓은 연결점   패킷은 연결점으로 들어온 데이터
		 * port 16bit  0 ~ 65535 (2^16)   0~1023은 쓰지말것.(윈도우에서 사용중) 1024~대략25000 여기는 상용프로그램이사용
		 * 
		 * 소켓끼리 연결하는게 IP랑 포트 IP는 피시를 구분하고 ,    소켓(연결점)이 여러개있는데 포트는 어떤 연결점에 연결하는지 결정
		 * pc에서 생성된 바이트데이터를 네이크워크환경에 맞는 데이터로 바꿀려면 패킷이라는걸로 바꿔야함. 
		 * 그래서 datagramPacket을 만들어준것.
		 * 상대방이 패킷으로 보내니까 나도 패킷으로 받는것 그게 리시브
		 * 
		 * 들어온 데이터가 패킷
		 * 
		 */
		

	}

}
