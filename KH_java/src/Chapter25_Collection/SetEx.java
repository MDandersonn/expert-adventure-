package Chapter25_Collection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	
	public static HashSet<Integer> getLottoNumber() {
		HashSet<Integer> lottoNumber = new HashSet<Integer>();
		Random rand = new Random();
		
		while(lottoNumber.size() < 6) {
			Integer num = Integer.valueOf(rand.nextInt(45) + 1);
			lottoNumber.add(num);
		}
		
		return lottoNumber;
	}

	public static void main(String[] args) {
		/*
		 * 로또 번호 생성
		 *     - 1 ~ 45 까지의 핸덤 번호를 생성하여 리스트에 담는다.
		 *     - 중복된 번호 없이 리스트에 담기도록 한다.
		 *     - 총 6 개의 번호가 리스트에 저장되야 한다.
		 *     - 마지막에 출력 할 때는 오름차순으로 정렬하여 출력되도록 한다.
		 */
		
		/*
		 * 위에서 생성한 로또 번호 6개를 한 셋트라고 하자.
		 * 
		 * 1. 사용자가 원하는 수의 셋트로 로또 번호가 생성되어 파일에 저장 될 수 있도록 한다.
		 * 2. 저장할 때 D:\\lotto.txt 파일로 저장되도록 한다.
		 * 3. 한 줄에 한 셋트의 로또 번호가 출력되어야 한다.
		 * 4. 번호를 출력할 때 쉼표(,) 를 구분자로 하여 출력되도록 해야 한다.
		 */
		File f = new File("C:\\lotto.txt");
		
		int count = 10;
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			for(int i = 0; i < count; i++) {
				TreeSet<Integer> lots = new TreeSet<Integer>(getLottoNumber());
				
				String strLots = lots.toString();
				
				strLots = strLots.substring(1, strLots.length() - 1);
				
				bw.write(strLots);
				
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
