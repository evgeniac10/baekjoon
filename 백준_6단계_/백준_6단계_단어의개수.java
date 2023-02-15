package 백준_6단계_;

import java.util.Scanner;

public class 백준_6단계_단어의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		String str = sc.nextLine();
		str = str.trim();
		String[] str_2 = str.split(" ");

		for (int i = 0; i < str_2.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}
