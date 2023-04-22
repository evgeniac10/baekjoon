package 백준_6단계_;

import java.util.Scanner;

public class 백준_바구니순서바꾸기_10812번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //10
		int[] arr = new int[N]; // 출력해야할 배열 
		int M = sc.nextInt(); //5

		for (int i = 1; i <= N; i++) {
			arr[i - 1] = i;
		}
		// 1 2 3 4 5 6 7 8 9 10
		for (int T = 0; T < M; T++) {
			int i = sc.nextInt(); // 1
			int j = sc.nextInt(); // 6
			int k = sc.nextInt(); // 4
			int basket[] = new int[j]; // 순회하는 배열 
			int index = 0;
			for (int iter = i; iter <= j; iter++) {
				basket[index] = arr[iter]; // 1 2 3 4 5 6
				index++;
			}
			for() {
				
			}

		}

	}
}
