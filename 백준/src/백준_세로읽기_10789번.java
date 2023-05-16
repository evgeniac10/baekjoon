package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_세로읽기_10789번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char arr[][] = null;
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				arr[i][j]= str.charAt(j);
			}
		}

	}

}
