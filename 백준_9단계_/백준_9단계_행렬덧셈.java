package 백준_9단계_;

import java.util.Scanner;

public class 백준_9단계_행렬덧셈 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		
		int row = in.nextInt(); 
		int col = in.nextInt();
		
		int sum[][] = new int[row][col]; 
		int sum2[][] = new int[row][col]; 
		int total[][] = new int[row][col]; 

		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				sum[i][j] = in.nextInt();
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				sum2[i][j] = in.nextInt();
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				total[i][j] = sum[i][j] + sum2[i][j];
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(total[i][j]);
			}
		}
	in.close();}
}
