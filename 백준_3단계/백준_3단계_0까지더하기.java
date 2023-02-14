package 백준_3단계_;

import java.util.Scanner;

public class 백준_3단계_0까지더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B ;
			
			if (sum == 0) 
			{
				break;
			}
			System.out.println(sum);
		}

	sc.close();}
}


