package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_ROT13_11655번 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			 if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
	                if (str.charAt(i) >= 'N') {
	                    sb.append((char)(str.charAt(i) - 13));
	                } else {
	                	sb.append((char)(str.charAt(i) + 13));
	                }
	            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	                if (str.charAt(i) >= 'n') {
	                	sb.append((char)(str.charAt(i) - 13));
	                } else {
	                	sb.append((char)(str.charAt(i) + 13));
	                }
	            }
	            else {
	            	sb.append(str.charAt(i));
	            }
		}
		System.out.println(sb);
	}

}
