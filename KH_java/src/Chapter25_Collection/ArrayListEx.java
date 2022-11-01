package Chapter25_Collection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> arr =new ArrayList<>();
		Random rand = new Random();
		int i=0;
		while(i<6){
			
			Integer num=rand.nextInt(45)+1; //0~44 +1
			if (arr.contains(num)) {
				continue;
			}
			arr.add(num);
			i++;
		}
		Collections.sort(arr);
		System.out.println(arr);
		
		try(BufferedWriter fw = new BufferedWriter(new FileWriter("D:\\lotto.txt",true))) {
			for( i=0 ;i<arr.size()-1; i++) {
				fw.write(String.format("%2d, ", arr.get(i)));
			}
			fw.write(String.format("%2d\r\n", arr.get(arr.size()-1)));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
