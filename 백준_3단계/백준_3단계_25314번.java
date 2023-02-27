package 백준_3단계_;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준_3단계_25314번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String str = "long";
		sc.close();
		ArrayList list = new ArrayList();
		while (true) {
			if (N <= 0) {
				break;
			} else if (N > 0) {
				N = N - 4;
				list.add(str);
			}
		}
		for(int i=0; i<list.size(); i++) {
		System.out.print(list.get(i)+ " ");
		}
		System.out.print("int");
	sc.close();
	}
}
