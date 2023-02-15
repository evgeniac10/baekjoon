package 백준_6단계_;

import java.util.Scanner;

public class 백준_6단계_숫자의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String str = sc.next();
		int sum = 0;

		for (int i = 0; i < T; i++) {
			int number = str.charAt(i) - 48;
			sum = sum + number;
		}
		System.out.println(sum);
	sc.close();
	}
}
