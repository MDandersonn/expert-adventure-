package Chapter06_file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024];
        FileInputStream fr = new FileInputStream("D:/out.txt");
        fr.read(b);
        System.out.println(new String(b));  // byte 배열을 문자열로 변경하여 출력
        fr.close();
        
        
        System.out.println("==================");
        BufferedReader br = new BufferedReader(new FileReader("D:/out.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        br.close();
	}

}
