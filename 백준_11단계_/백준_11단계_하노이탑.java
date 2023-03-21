package 백준_11단계_;

import java.io.*;

public class 백준_11단계_하노이탑 {

	static StringBuilder sb = new StringBuilder(); // 스트링빌더를 메인메서드 하노이메서드에서 둘다 써야하기에 전역변수로 생성

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		sb.append((int) (Math.pow(2, N) - 1) + "\n"); // 하노이탑에서 수학적 점화식으로 통하면 2^n-1회 만큼 움직여야함을 알수 있다.

		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
	}

	public static void Hanoi(int n, int one, int two, int three) {
		if (n == 1) {
			sb.append(one + " " + three + "\n");
			return; //리턴이 없었다면 재귀에서 스택오버플로우가 발생하니 유념하자
		}
		Hanoi(n - 1, one, three, two); // one기둥에 있던 원반을 two기둥에 옮긴다.
		sb.append(one + " " + three + "\n"); // 가장 아래에 있던 원반을 three 기둥에 옮긴다.
		Hanoi(n - 1, two, one, three); // two 기둥에 있던 원반을 three기둥에 옮긴다.
	}
}
