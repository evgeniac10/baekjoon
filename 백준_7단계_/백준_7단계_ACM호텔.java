package 백준_7단계_;
import java.util.*;
//unit 호수 , floor 층
public class 백준_7단계_ACM호텔 {

	static int floor(int first , int second , int third) 
	{
		int unit = (third / first) + 1;
		int floor =(third % first) ;
		
		return unit + floor* 100;
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int test = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int H_2 = sc.nextInt();
		int W_2 = sc.nextInt();
		int N_2 = sc.nextInt();
		
		System.out.println(floor(H,W,N));
		System.out.println(floor(H_2,W_2,N_2));

	}

}
