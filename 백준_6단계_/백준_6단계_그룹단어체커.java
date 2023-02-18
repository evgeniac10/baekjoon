package 백준_6단계_;

import java.util.Scanner;

public class 백준_6단계_그룹단어체커 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = num;
		
		for (int i = 0; i < num; i++) {
			String str = sc.next(); // aabac
			boolean arr[] = new boolean[26];

			for (int j = 0; j < str.length() - 1; j++) {
				if (j < str.length() - 1 && str.charAt(j) != str.charAt(j + 1)) {
					if (arr[str.charAt(j + 1) - 97] == true) {
						count--;
						break;
					}
				}
				arr[str.charAt(j) - 97] = true;
			}
		}
		System.out.print(count);
	}

}
