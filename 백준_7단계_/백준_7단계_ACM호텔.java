package 백준_7단계_;
import java.util.*;
public class 백준_7단계_ACM호텔 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for(int i =0; i<test; i++) {
			int floor = sc.nextInt();
			int unit = sc.nextInt();
			int N = sc.nextInt();
			if((N%floor)==0) {
				System.out.println(floor*100 + (N/floor) );

			}
			else {
				System.out.println((N%floor)*100 + (N/floor+1) );

			}
		}
	sc.close();}

}
