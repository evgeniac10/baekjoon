package 백준_6단계_;

import java.util.Scanner;

public class 백준_6단계_문자열반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			
			int R = sc.nextInt();
			String str = sc.next();
			
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
