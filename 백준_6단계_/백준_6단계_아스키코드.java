package 백준_6단계_;

import java.util.Scanner;

public class 백준_6단계_아스키코드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		int code = (int)input;
		
		System.out.println(code);
		sc.close();
	}

}
