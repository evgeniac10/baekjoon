package 백준_11단계_;

import java.util.Scanner;

public class 백준_11단계_재귀의귀재 {
	static int cnt; 	//클래스 내에 스태틱으로 메모리에 고
	public static int recursion(String s, int fir, int last) {
		cnt++;
		if (fir >= last) {
			return 1;
		} else if (s.charAt(fir) != s.charAt(last)) {
			return 0;
		} else {
			return recursion(s, fir + 1, last - 1);
		}
	}

	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			cnt =0;
			System.out.println(isPalindrome(sc.next()) + " " + cnt);
		}
	}
}
