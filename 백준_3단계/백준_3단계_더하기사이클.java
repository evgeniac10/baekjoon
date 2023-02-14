package 백준_3단계_;

import java.util.Scanner;

public class 백준_3단계_더하기사이클 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int box = -1;
		int count =0;
		
		
		while(true)
		{
			if(box == -1)
			{
				int sep = N/10 + N%10 ;
				int num = (N%10)*10 + sep%10;
				box = num ; //0 = 68
				count++;
			}
		
			else if(N == box) 
			{
				break;
			}
			
			else 
			{
				int sep_2 = box/10 + box%10;
				int num_2 = box%10*10 + sep_2%10;
				box = num_2; //68 = 84
				count++;
			}
		}
		
		System.out.print(count);
	}
}

