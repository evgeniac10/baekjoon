package 백준_7단계_;
import java.util.*;
public class 백준_7단계_설탕배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int big = num / 5; 
		int small = (num -big*5) / 3 ;
		
		if ((num -big*5) % 3 != 0) 
		{
			System.out.println(-1);
		}
		else if ( (num -big*5) % 3  == 1) 
		{
			System.out.println(big + small + 1);
		}
		
		else if ((num -big*5) % 3  == 2) 
		{
			System.out.println(big + small + 1);
		}
		else
		{
		System.out.println(big + small);
		}
		
		
	}

}
