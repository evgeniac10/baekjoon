package 백준;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_접미사배열_11656번 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		Stack<String> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			st.add(str.substring(i, str.length()));
		}
		
		for(String k : st) {
			System.out.println(k);
		}
		
		
	}

}
