package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_10988번 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		String str = br.readLine();
		boolean ans ;
		
		if((str.length()%2) == 1) { // 홀수 
			int num = str.length()/2;
			for(int i=0; i<num; i++) {
				sb.append(str.charAt(i));
			}
			for(int j=str.length(); j>num+1; j--) {
				sb2.append(str.charAt(j-1));
			}
			if(sb.toString().equals(sb2.toString()))
				System.out.println(1);
			else
				System.out.println(0);
		}else {//짝수 
			int num = str.length()/2;
			for(int i=0; i<num; i++) {
				sb.append(str.charAt(i));
			}
			for(int j=str.length(); j>num; j--) {
				sb2.append(str.charAt(j-1));
			}
			if(sb.toString().equals(sb2.toString()))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
