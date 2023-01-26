package 백준_2단계;

import java.util.Scanner;

public class 백준_2단계_윤년 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			
		
		int year = sc.nextInt();
		int sssy = year%400;
		int ssy = year%100;
		int sy = year%4;
		
		
		//4배수이면서 100의배수가 아닐때
		if( sy = 0 && ssy != 0) {
			System.out.println("1");
		}
		//4배수이면서 400배수일때
		else if (sy = 0 && sssy = 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
