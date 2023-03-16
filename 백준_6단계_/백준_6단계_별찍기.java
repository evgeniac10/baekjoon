package 백준_6단계_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_6단계_별찍기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//*********
		for(int i=num; i>1; i--) {
			for(int j=i-1; j<=num-1; j++) {
				System.out.print(" ");
			}
			for(int k=2; k<2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
