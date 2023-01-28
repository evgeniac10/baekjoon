package 백준_3단계_;

import java.util.Scanner;

public class 백준_3단계_합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int plus = sc.nextInt();
		int sum = 0 ;
		int save  =0 ;
		
		for(int i = 0; i< plus; i++) {
			save = i + 1;
			sum = save+sum ;
		
			
		}
		 System.out.println(sum);
	}
}