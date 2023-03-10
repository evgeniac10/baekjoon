package 백준_5단계_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_5단계_27866번 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(S.charAt(num-1));
	}
}
