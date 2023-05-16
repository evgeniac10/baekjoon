package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_세로읽기_10789번 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char arr[][] = new char[5][15];
		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();
			
			if (str.length() > max)
				max = str.length();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		for(int k=0;k<max; k++) {
			for(int l=0; l<5; l++ ) {
				if(arr[l][k] =='\0')
					continue;
				sb.append(arr[l][k]);
			}
		}
		System.out.println(sb);
	}
}
