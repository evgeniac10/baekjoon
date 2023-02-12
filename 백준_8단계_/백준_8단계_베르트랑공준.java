package 백준_8단계_;
import java.util.*;
public class 백준_8단계_베르트랑공준 {
	static Boolean Prime(int num){
		if(num<2) {
			return false;
		}
		for(int i=2; i*i<=num; i++) {
			if(num%i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
		int num = in.nextInt();
			if(num ==0) {
				break;
			}
		int count = 0;
			for(int i=num+1; i<=num * 2; i++) {
				if(Prime(i) == true) {
					count++;	
				}
			}	
		System.out.println(count);
		}
		in.close();
	}
}
