package 백준_10단계_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 백준_10단계_수정렬2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			list.add(in.nextInt());
		}

		Collections.sort(list);

		for (int num : list) {
			sb.append(num).append('\n');
		}
		System.out.println(sb);
	in.close();
	}
}
