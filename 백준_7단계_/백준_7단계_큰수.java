package 백준_7단계_;

import java.util.Scanner;

public class 백준_7단계_큰수 {

	static double sum(double A , double B) {
		
		double result = A + B;	
		
		return result ;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
				
		System.out.println (sum(A , B));
	}

}
