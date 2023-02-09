package 백준_8단계_;
import java.util.*;

public class 백준_8단계_베르트랑공준 {// 10 11 13 17 19 20

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int num = in.nextInt();
		int max = num * 2;
		
		for(; num<=max; num++ ) {
			for(int i = 2; i<max; i++) {
				if(num % i == 0) {
				}
			}
		}
	}
}
