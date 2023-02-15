package 백준_8단계_;

import java.util.*;

public class 백준_8단계_골드바흐의추측 {
	static Boolean Prime(int num) {// 소수인지 소수가 아닌지 판별하는 메소드
		if (num < 2) {
			return false;
		} else {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int k = 0; k < T; k++) {
			int even = sc.nextInt() / 2;
			int front = even;
			int back = even;

			if (Prime(even) == true) {
				System.out.println(even + " " + even);
			} else {
				front--;
				back++;
				while (true) {
					if (Prime(front) && Prime(back)) {
						System.out.println(front + " " + back);
						break;
					}
					else {
						front--;
						back++;
					}
				}
			}
		}
		sc.close();
	}
}
