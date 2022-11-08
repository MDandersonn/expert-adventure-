package lv0.머쓱이보다키큰사람;

import java.util.Arrays;

public class 스트림 {

	public static void main(String[] args) {
		int[] arr = {149,180,192,170};
		int result =(int) Arrays.stream(arr).filter(a -> a>167).count();
		System.out.println(result);

	}

}
