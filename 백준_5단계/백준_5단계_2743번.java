package 백준_5단계_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_5단계_2743번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count =0;
		String str = br.readLine();
		str.split("");
//		System.out.println(str);
		for(int i=0; i<str.length(); i++) {
			str.charAt(i);
			count++;
		}
		System.out.println(count);
	}
}
