package 백준_8단계_;

import java.util.*;

public class 백준_8단계_소수 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int start = in.nextInt();
		int finish = in.nextInt();
		int sum = 0;
		int min = finish;
		
		for(int i = start; i<=finish; i++) {
			if(Prime(i) == true) {
				sum += i;
			}
		}
		if(sum != 0) {
		for(int i = start; i<=finish; i++) {
			if(Prime(i) == true) {
				if(min > i) {
					min = i;
				}
			}
		}
		System.out.println(sum);
		System.out.println(min);}
		if(sum == 0) {
			System.out.println(-1);
		}
in.close();	}
	public static boolean Prime(int number) {// 참은 소수 거짓은 합성
		if(number < 2) {
			return false;
		}
		else if(number ==2) {
			return true;
		}
		for(int i =2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
