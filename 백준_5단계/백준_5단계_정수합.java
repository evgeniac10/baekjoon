package 백준_5단계_;

import java.util.Scanner;

class Test{
	static long sum(int[] a) {
		long result =0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class 백준_5단계_정수합 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
	in.close();
	}
}
