package Chapter24_SubStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataClass {

	public static void main(String[] args) {
		File f= new File("D:\\sample3.txt");
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))){
			dos.writeInt(100);
			dos.writeDouble(12.5);
			dos.writeBoolean(false);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
			int i= dis.readInt();
			double d = dis.readDouble();
			boolean b =dis.readBoolean();
			System.out.println(i+" "+d +" "+b);// write한 순서대로 읽어야한다.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

}
