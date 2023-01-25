package 백준;
import java.util.Scanner;
public class 백준_별찍기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		//for(초기화 ; 반복조건 ;반복 후 실행 동작)
		for(int a = 0; a < star; a++) {
		
			for(int b = 1; b <= a+1; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	}

}
