package 백준_6단계_;

import java.util.Scanner; // 소문자 a 는 97

public class 백준_6단계_알파벳찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		int arr[] = new int[26];

		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}

		for (int ch_index = 0; ch_index < name.length(); ch_index++) {
			int index = name.charAt(ch_index) - 97;
			if (arr[index] != -1) {
				continue;
			}
			arr[index] = ch_index;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
