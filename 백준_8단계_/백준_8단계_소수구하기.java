package 백준_8단계_;
import java.util.*;
public class 백준_8단계_소수구하기 {
	static boolean Prime(int num) {
		if(num<2)
			return false;
		for(int i=2; i*i <= num; i++) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int finish = in.nextInt();
			for(int j=start; j<=finish; j++) {
				if(Prime(j) == true) {
					System.out.println(j);			
					}
			} 
	in.close();
	}
}
