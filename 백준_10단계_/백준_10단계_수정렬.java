package 백준_10단계_;
import java.util.*;

public class 백준_10단계_수정렬 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		int T = in.nextInt();
		
		for(int i=0; i<T; i++) {
		number.add(in.nextInt());
		}
		Collections.sort(number);
		
		for(int i=0; i<T; i++) {
		System.out.println(number.get(i));
		}
	in.close();
	}
}
