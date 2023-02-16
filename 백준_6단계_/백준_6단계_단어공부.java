package 백준_6단계_;

import java.util.Scanner;

public class 백준_6단계_단어공부 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		str = str.toUpperCase();

		int arr[] = new int[26];
		int count = 0;
		char result = ',';

		for (int i = 0; i < str.length(); i++) {
			count = str.charAt(i) - 65;
			arr[count]++;
		}
		int select = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > select) {
				select = arr[i];
				result = (char) (i+65);
			} else if (arr[i] == select) {
				result = '?';
			}
		}
		System.out.print(result);
	}
}
