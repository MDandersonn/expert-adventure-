package Chapter23_InOut;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) {
		/*
		 * 입출력
		 * 	컴퓨터 내부/외부 장치간에 데이터를 교환하기 위해 사용
		 * 프로그램을 기준으로 내부/외부 장치에서 데이터가 현재 동작하는 프로그램으로 들어오면 입력 반대로
		 * 현재 동작하는 프로그램에서 내부/외부 장치로 내보내면 출력이라고 한다
		 * (하드디스크의 파일을 프로그램내에서 사용할수 있도록 불러올때는 입력 
		 * 반대로 프로그램에서 생성한 데이터를 하드디스크의 파일로 내보낼때는 출력)
		 * 입출력은 입력스트름,출력스트림이 개별로 존재하며 입력스트림으로는 입력만, 출력스트림으로는 출력만 수행할 수 있다.
		 * 
		 *  스트림(Stream)
		 *   - 두 장치간에 데이터를 교환하기 위해 생성한 데이터 통로
		 *   -스트림은 입력/출력 스트림으로 나누어져 있고 또한 그 안에서 바이트기반스트림과 문자기반스트림으로 나누어져있다.
		 *   -바이트기반 스트림의 경우 이미지,영상,실행파일 등의 바이트기반으로 생성된 데이터를 입출력할 때 사용한다
		 *   -문자기반스트림의 경우 텍스트 문서 등의 문자기반으로 생성된 데이터를 입출력 할 때 사용한다. 
		 *  
		 *  
		 */
		File f = new File("D:\\sample.txt");
		
		System.out.printf(" %d byte\n",f.length());
		System.out.printf("%1$tY년 %1$tm월 %1$td일에 수정함 \n", f.lastModified());
		System.out.printf("파일유무 :%s\n", f.isFile());
		System.out.printf("폴더유무 :%s\n", f.isDirectory());
		System.out.printf("숨김유무 :%s\n", f.isHidden());
		
		System.out.printf("파일/폴더명 : %s\n",f.getName());
		System.out.printf("파일/폴더 상위경로: %s\n",f.getParent());
		System.out.printf("파일/폴더 전체경로 : %s\n",f.getPath());
		
		System.out.printf("존재유무 : %s\n",f.exists());
		
		File f2= new File("D:\\temp");
		
		if(!f2.exists()) {
//			f2.mkdir();
			try {
				f2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.printf("파일/폴더명 : %s\n",f2.getName());
		System.out.printf("파일/폴더 상위경로: %s\n",f2.getParent());
		System.out.printf("파일/폴더 전체경로 : %s\n",f2.getPath());
		f2.delete(); //삭제
		
		System.out.println("==================================");
		File f3 =new File("D:\\parent\\child\\sample.txt");
		
		if(!f3.exists()) {
			File tmpFile = new File(f3.getParent());
			tmpFile.mkdirs();//없는 모든 상위 디렉토리경로의 디렉토리를 만들어준다.
			//f3.mkdirs(); 로 하면 sample.txt가 폴더로 만들어진다. 
			try {
				f3.createNewFile(); //그다음 파일을 만든다
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
