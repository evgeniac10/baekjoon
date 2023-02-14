package 백준_3단계_;

import java.util.Scanner;

public class 백준_3단계_영수증 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum =0;
		for(int i=0; i<N; i++) {
			int num_i = sc.nextInt();
			int thing_i =sc.nextInt();
			int price = num_i * thing_i;
			sum = price + sum;
		}

		if(X == sum) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	sc.close();}
}
	
