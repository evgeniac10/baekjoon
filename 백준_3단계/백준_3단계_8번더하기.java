package 백준_3단계_;

import java.util.Scanner;

public class 백준_3단계_8번더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int num_i ;
		int num2_i;
		int sum ;
		int i ;
		for(i=1; i<=T; i++) {
			 num_i = sc.nextInt();
			 num2_i = sc.nextInt();
			 sum = num_i + num2_i;
				System.out.println("Case #" + i + ": " + num_i + " + " + num2_i + " = "+ sum);

		}
		
	}

}
