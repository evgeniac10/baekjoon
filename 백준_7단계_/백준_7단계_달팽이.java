package 백준_7단계_;

import java.util.Scanner;

public class 백준_7단계_달팽이 {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		int go = sc.nextInt();
		int back = sc.nextInt();
		int day = sc.nextInt();
		
		if((day - back) % (go-back) ==0){
			System.out.println((day - back) / (go-back));
		}
		else if((day - back) % (go-back) != 0) {
			System.out.println((day - back) / (go-back) +1);

		}
	}
}
	