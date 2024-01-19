package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Lotto {

	public static void main(String[] args) {
		ArrayList <Integer>a = new ArrayList<Integer>();
		ArrayList<Integer>b = new ArrayList<Integer>();
		
		for (int i=1; i<46; i++) {
			a.add(i);
		}
		
		Collections.shuffle(a);
		int[] lottoNumArr = new int [6];
		for (int i=0; i<lottoNumArr.length;i++) {
			lottoNumArr[i]=a.get(i);
		}
		String lottoNumStr = Arrays.toString(lottoNumArr);
		System.out.printf("자동 생성 로또 번호: %s\n", lottoNumStr);
		for (int i=0; i<lottoNumArr.length; i++) {
			a.remove(lottoNumArr[i]);
		}
	}

}
