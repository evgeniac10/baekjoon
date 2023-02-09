package 백준_7단계_;

import java.util.Scanner;

public class 백준_7단계_손익분기점 {

		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// A는 고정비용 B는 가변비용 C는 수익 
		
		long A = sc.nextLong(); 
		long B = sc.nextLong();
		long C = sc.nextLong();
		long i = 0 ;
		
		
		if(B >= C) 
		{
			System.out.println(-1);
		
		}
		else
		{
			for(i =1; A+B*i >= C*i; i++) 
			{
				
			}
			System.out.println(i);
		}
		sc.close();
	}

}
