package 백준_3단계_;

import java.util.Scanner;

public class 백준_3단계_별찍기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		//i = 0 j = 4 ,3 2, 1
		//i = 0 ,1 j = 3 2 1 
		//i = 0 1 2 j = 2 1
		for(int i=0; i<T; i++) 
		{
			for(int a=1; a<T-i; a++) 
			{
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
			sc.close();
	}	

}
