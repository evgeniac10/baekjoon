package 백준_9단계_;

import java.util.*;

public class 백준_9단계_최댓값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[10][10];
		int max = -1;
		int row = 0;
		int col = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				} else if (max == arr[i][j]) {
					continue;
				}
			}
		}
		System.out.println(max);
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (max == arr[i][j]) {
					row = i;
					col = j;
				}
			}
		}
		System.out.print(row + " " + col);
		sc.close();
	}
}
