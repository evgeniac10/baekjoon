package 백준;
import java.util.Scanner;
public class 백준_별찍기2 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		int star = n.nextInt();
		// 반복문 더 연습
		//for(초기화 ; 반복조건 ; 반복실행 )
		for(int a = 0 ;  a < star  ; a++  ) {
			
			for(int b= 1; b<star - a;b++) {
				System.out.print(" ");
			}
			for (int c=0;c<a+1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}	

	}
}
