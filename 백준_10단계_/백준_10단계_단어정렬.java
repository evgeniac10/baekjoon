package 백준_10단계_;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class 백준_10단계_단어정렬 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		String[] arr = new String[N];

		in.nextLine(); // 개행 버림

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextLine();
		}

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 문자열 타입의 각 객체들의 아스키코드 값을 비교하여 출력한다.
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				// 그 외의 경우
				else {
					return s1.length() - s2.length();
				}
			}
		});
		System.out.println(arr[0]);
		for (int i = 1; i < N; i++) {
			if(!arr[i-1].equals(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
}
