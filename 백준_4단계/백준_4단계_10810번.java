package 백준_4단계_;

import java.util.Scanner;

public class 백준_4단계_10810번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int basket = sc.nextInt();
		int T = sc.nextInt();
		int arr[] = new int[basket + 1];

		for (int i = 0; i < T; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			int number = sc.nextInt();
			for (int start = j; j <= k; j++) {
				arr[j] = number;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
