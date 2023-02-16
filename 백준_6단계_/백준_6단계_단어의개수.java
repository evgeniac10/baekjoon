package 백준_6단계_;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_6단계_단어의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine().trim();
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println(st.countTokens());
		
	}
}
