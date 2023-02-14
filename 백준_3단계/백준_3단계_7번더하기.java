package 백준_3단계_;

import java.util.Scanner;

public class 백준_3단계_7번더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=T; i++) {
			int num_i = sc.nextInt();
			int num2_i = sc.nextInt();
			sum = num_i + num2_i;
			System.out.println("Case #" + i +": "+ sum);
		}
	sc.close();
	}

}
