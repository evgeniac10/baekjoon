package 백준_3단계_;

import java.util.Scanner;

public class 백준_3단계_입력끝까지더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}

	}

}
