package 백준_8단계_;

import java.util.Scanner;

// 소수란 약수가 1과 자기 자신
// 약수란 어떤 수를 나누어 떨어지게 하는 수
public class 백준_8단계_소수찾기 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int count = 0 ;
		
		for(int i =0; i<T; i++) {
			if(Prime(in.nextInt()) == true) {
				count++;
			}
		}
		System.out.println(count);
	in.close();}
	public static boolean Prime(int number) {
		if(number < 2) {
			return  false ;
		}
		if(number == 2) {
			return true ;
		}
		for(int i =2; i < number; i++) {
			if(number % i ==0) {
				return false;
			}
		}
		return true;
	}
}
